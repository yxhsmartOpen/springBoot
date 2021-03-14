package com.baron.rpc.consumer.proxy;


import com.baron.rpc.protocol.InvokerProtocol;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RpcProxy {
    public static <T> T create(Class<?> clazz){

        MethodProxy proxy = new MethodProxy(clazz);
        Class<?> [] interfaces = clazz.isInterface() ?
                                 new Class[]{clazz} :
                                 clazz.getInterfaces();
        T result = (T)Proxy.newProxyInstance(clazz.getClassLoader(),interfaces,proxy);
        return result;
    }

    public static class MethodProxy implements InvocationHandler {
        private Class<?> clazz;
        public MethodProxy(Class<?> clazz) {
            this.clazz = clazz;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if(Object.class.equals(method.getDeclaringClass())){
                return method.invoke(this,args);
            }else{
                return rpcInvoke(proxy,method,args);
            }
        }

        private Object rpcInvoke(Object proxy, Method method, Object[] args) {

            //封装请求的内容
            InvokerProtocol msg = new InvokerProtocol();
            msg.setClassName(this.clazz.getName());
            msg.setMethodName(method.getName());
            msg.setParams(method.getParameterTypes());
            msg.setValues(args);


            final RpcProxyHandler consumerHandler = new RpcProxyHandler();


            EventLoopGroup group = new NioEventLoopGroup();

            try {
                Bootstrap client = new Bootstrap();
                client.group(group)
                        .channel(NioSocketChannel.class)
                        .handler(new ChannelInitializer() {
                            @Override
                            protected void initChannel(Channel ch) throws Exception {
                                //接收课客户端请求的处理流程
                                ChannelPipeline pipeline = ch.pipeline();

                                int fieldLength = 4;
                                //通用解码器设置
                                pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE,0,fieldLength,0,fieldLength));
                                //通用编码器
                                pipeline.addLast(new LengthFieldPrepender(fieldLength));
                                //对象编码器
                                pipeline.addLast("encoder",new ObjectEncoder());
                                //对象解码器
                                pipeline.addLast("decoder",new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));

                                pipeline.addLast("handler",consumerHandler);
                            }
                        })
                        .option(ChannelOption.TCP_NODELAY, true);

                ChannelFuture future = client.connect("localhost",8080).sync();
                future.channel().writeAndFlush(msg).sync();
                future.channel().closeFuture().sync();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                group.shutdownGracefully();
            }

            return consumerHandler.getResponse();
        }
    }
}

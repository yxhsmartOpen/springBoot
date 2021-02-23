package com.baron.springboot;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * @author yangxuanhua
 * @date 2021/1/12 13:55
 */
@Slf4j
public class NewIoServer {

    static Selector selector;

    public static void main(String[] args) {
        try {
            selector = Selector.open();
            ServerSocketChannel channel = ServerSocketChannel.open();
            channel.configureBlocking(false);
            channel.socket().bind(new InetSocketAddress(8080));
            channel.register(selector, SelectionKey.OP_ACCEPT);
            while (true){
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterators = selectionKeys.iterator();
                while (iterators.hasNext()){
                    SelectionKey key = iterators.next();
                    iterators.remove();
                    if (key.isAcceptable()) {
                        handleAccept(key);
                    } else if (key.isReadable()){
                        handleRead(key);
                    }
                }
            }
        } catch (IOException e) {
            log.info("发生异常，请检查代码逻辑是否正常！",e);
        }
    }

    private static void handleRead(SelectionKey key) {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try {
            socketChannel.read(byteBuffer);
            log.info("server receive msg:"+new String(byteBuffer.array()));
        }catch (Exception e){
            log.info("handleRead代码发生异常，请检查代码逻辑是否正常！");
        }
    }

    private static void handleAccept(SelectionKey key) {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        try {
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(false);
            socketChannel.write(ByteBuffer.wrap("Hello Client,I'm NIO Server".getBytes()));
            socketChannel.register(selector,SelectionKey.OP_READ);
        }catch (Exception e){
            log.info("handleRead代码发生异常，请检查代码逻辑是否正常！");
        }
    }

}

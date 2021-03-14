package com.baron.rpc.consumer;


import com.baron.rpc.api.IRpcHelloService;
import com.baron.rpc.api.IRpcService;
import com.baron.rpc.consumer.proxy.RpcProxy;

public class RpcConsumer {
    public static void main(String[] args) {

        IRpcHelloService rpcHello = RpcProxy.create(IRpcHelloService.class);
        System.out.println(rpcHello.hello("Tom"));

        IRpcService rpc = RpcProxy.create(IRpcService.class);

        System.out.println("8 + 2 = " + rpc.add(8,2));
        System.out.println("8 - 2 = " + rpc.sub(8,2));
        System.out.println("8 * 2 = " + rpc.mult(8,2));
        System.out.println("8 / 2 = " + rpc.div(8,2));

    }
}

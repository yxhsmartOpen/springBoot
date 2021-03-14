package com.baron.rpc.provider;


import com.baron.rpc.api.IRpcHelloService;

public class RpcHelloServiceImpl implements IRpcHelloService {
    public String hello(String name) {
        return "hello " + name + "!";
    }
}

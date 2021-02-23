package com.baron.springboot;

import lombok.extern.slf4j.Slf4j;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @author yangxuanhua
 * @date 2021/1/12 11:40
 */
@Slf4j
public class ServerSocketDemo {
   final static ExecutorService executorService= Executors.newFixedThreadPool(20);

    public static void main(String[] args) {
        ServerSocket serverSocket = null ;
        try {
            serverSocket = new ServerSocket(8000);
            while (true){
                Socket socket = serverSocket.accept();
                log.info(socket.getPort()+"");
                executorService.execute(new SocketThread(socket));;
            }
        }catch (Exception e){
            log.info("发生异常，请检查代码逻辑是否正常！",e);
        }
    }
}

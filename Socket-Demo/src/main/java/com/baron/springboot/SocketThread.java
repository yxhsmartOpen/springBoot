package com.baron.springboot;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;

/**
 * @author yangxuanhua
 * @Description 自定义线程
 * @date 2021/1/12 11:50
 */
@Slf4j
public class SocketThread implements Runnable {
    private final Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientStr = bufferedReader.readLine();
            log.info("接收到客户端的信息：" + clientStr);
            // 写回去
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我收到了信息\n");
            bufferedWriter.flush();
        } catch (IOException e) {
           log.info("发生异常，请检查代码逻辑是否正常！",e);
        } finally {
            try {
                if (null != bufferedReader)
                    bufferedReader.close();
                if (null != bufferedWriter)
                    bufferedWriter.close();
            } catch (IOException e) {
                log.info("资源关闭异常！",e);
            }
        }
    }
}

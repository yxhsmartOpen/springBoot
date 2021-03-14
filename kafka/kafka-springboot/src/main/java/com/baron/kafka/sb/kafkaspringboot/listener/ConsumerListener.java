package com.baron.kafka.sb.kafkaspringboot.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author: qingshan
 */
@Component
public class ConsumerListener {
    @KafkaListener(topics = "springboottopic22",groupId = "springboottopic-group")
    public void onMessage(String msg){
        Objects.requireNonNull(msg, "msg cannot be null");
        System.out.println("----收到消息："+msg+"----");
    }
}

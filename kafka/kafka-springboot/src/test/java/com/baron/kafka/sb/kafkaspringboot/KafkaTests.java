package com.baron.kafka.sb.kafkaspringboot;


import com.baron.kafka.sb.kafkaspringboot.producer.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author qingshan
 */
@SpringBootTest
class KafkaTests {

    @Autowired
    KafkaProducer producer;

    // 消费者：先启动 kafkaApp
    @Test
    void testSendMsg() {
        long time = System.currentTimeMillis();
        System.out.println("----"+time +"，已经发出----");
        producer.send("qingshan penyuyan, " +time);
    }
}

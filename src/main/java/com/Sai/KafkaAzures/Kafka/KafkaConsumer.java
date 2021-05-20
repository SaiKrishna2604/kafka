package com.Sai.KafkaAzures.Kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics="news",groupId = "my_group_id")
    public void receiveMessages(String message){
    System.out.println(message);
    }
}

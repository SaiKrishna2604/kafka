package com.Sai.KafkaAzures.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static  final String TOPIC = "news";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessages(String message){
        this.kafkaTemplate.send(TOPIC,message);
    }

}

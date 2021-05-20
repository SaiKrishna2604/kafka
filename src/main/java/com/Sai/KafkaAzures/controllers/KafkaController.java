package com.Sai.KafkaAzures.controllers;

import com.Sai.KafkaAzures.Kafka.KafkaProducer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final com.Sai.KafkaAzures.Kafka.KafkaProducer kafkaproducer;

    public KafkaController(KafkaProducer kafkaproducer) {
        this.kafkaproducer = kafkaproducer;
    }
    @PostMapping("/publish/{message}")
    public void sendMessagesToTopic(@PathVariable String message){
        this.kafkaproducer.sendMessages(message);
    }
}

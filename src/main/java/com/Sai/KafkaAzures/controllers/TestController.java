package com.Sai.KafkaAzures.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("/message/{user}")
    public String displayMessage(@PathVariable String user){

        return "Hi from backend !!"+user+".";
    }
}

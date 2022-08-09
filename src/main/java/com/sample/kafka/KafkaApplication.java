package com.sample.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
@ComponentScan({"com.sample.kafka.configuration", "com.sample.kafka.controller", "com.sample.kafka.producer", "com.sample.kafka.client"})
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

}
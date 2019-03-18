package com.sample.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.kafka.producer.KafkaProducer;
import com.sample.kafka.producer.model.ProducerPayload;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);

	@Autowired
	private KafkaProducer producer;

	 @PostMapping(value = "/publish")
	 public void sendMessageToKafkaTopic( ProducerPayload payload) {
		 	logger.info("Processing POST Request ");
	        this.producer.sendMessage(payload.getMessage());
	    }
	 
	 
	 @GetMapping(value = "/testGet")
	 public void sendMessageToKafkaTopic(@RequestParam("message") String reqParam) {
		 	logger.info("Processing GET Request ");
	        logger.info("Payload is " + reqParam);
	    }
	
	public KafkaProducer getProducer() {
		return producer;
	}

	public void setProducer(KafkaProducer producer) {
		this.producer = producer;
	}

}


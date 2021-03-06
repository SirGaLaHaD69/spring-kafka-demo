package com.ms.producer.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ms.producer.entities.Student;

@Service
public class ProducerService {

	public static final Logger logger = LoggerFactory.getLogger(ProducerService.class);
	@Autowired
	private KafkaTemplate<String, Student> kafkaTemplate;
	private static final String TOPIC ="jsonTopic2";
	
	
	public void sendMessage(Student student) {
		kafkaTemplate.send(TOPIC,student);
		logger.info("Message:\t"+ student.toString()+ " was published to topic:\t" +TOPIC);
	}
	
}

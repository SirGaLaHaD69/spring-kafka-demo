package com.ms.consumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ms.producer.entities.Student;



@Service
public class ConsumerService {
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
	
	@KafkaListener(topics = "myTopic", groupId = "group_id")
	public void consume(String msg) {
		logger.info("Consumed String: "+ msg + " from topic: myTopic");
	}
	/*
	 * 
	 * we can have multiple listeners listening to same/different topics
	 * */
	
	@KafkaListener(topics = "jsonTopic2",groupId = "group_json",containerFactory ="kafkaStudentListenerContainerFactory")
	public void studentConsume(Student student) {
		logger.info("Consumed Student Object :\t"+student.toString()+"topic: jsonTopic2");
	}
	
}

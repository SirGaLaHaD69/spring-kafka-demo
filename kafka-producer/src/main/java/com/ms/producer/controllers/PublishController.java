package com.ms.producer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.producer.entities.Student;
import com.ms.producer.services.ProducerService;

@RestController
public class PublishController {

	@Autowired
	private ProducerService producerService;
	
	@PostMapping("/publish")
	ResponseEntity<Student> publishMessage(@RequestBody Student student) {
		
		producerService.sendMessage(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
}

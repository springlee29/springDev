package com.dev.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.example.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping(value="/first")
	public ResponseEntity<String> first(HttpServletRequest request){
		testService.business1();
		
		return ResponseEntity.ok("OK");
	}
}

package com.dev.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	public void business1() {
		logger.info("business01");
	}
	
	public void business2() {
		logger.info("business02");
	}

}

package com.cc.hello.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements IhelloService {
	
	private static final Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public String hello() {
		log.info("Now we in {} service!", "hello");
		return "Hello Word!";
	}

}

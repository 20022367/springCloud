package com.cc.hello.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {
	
	private static final Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public String hello() {
		log.info("Now we in {} service!", "hello");
		return "Hello Word!";
	}

}

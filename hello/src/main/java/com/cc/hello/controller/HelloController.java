package com.cc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.hello.service.IhelloService;

@RestController
public class HelloController {
	
	@Autowired
	IhelloService helloService;

	@RequestMapping(value="/hello" ,method=RequestMethod.GET)   
	public String hello() {
		return helloService.hello();
	}
}

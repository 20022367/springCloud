package com.cc.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZipkinApplication.class);
	}

}

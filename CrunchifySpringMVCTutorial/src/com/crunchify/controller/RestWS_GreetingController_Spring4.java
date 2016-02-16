package com.crunchify.controller;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crunchify.process.Greeting;

@RestController
public class RestWS_GreetingController_Spring4 {
	
	private static String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();

	//ur1
	//http://localhost:8080/CrunchifySpringMVCTutorial/rest/greeting	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="world") String name){			
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
	
	//ur1
	//http://localhost:8080/CrunchifySpringMVCTutorial/rest/greeting/Mark	
	@RequestMapping("/greeting/{name}")	
	public Greeting greeting1(@PathVariable("name") String name){			
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
}

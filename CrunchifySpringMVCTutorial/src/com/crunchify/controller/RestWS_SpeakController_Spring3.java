package com.crunchify.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crunchify.process.Greeting;

@Controller
@RequestMapping("/speak")
public class RestWS_SpeakController_Spring3 {
	private static String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
		
	//ur1
	//http://localhost:8080/CrunchifySpringMVCTutorial/rest/speak/Mark
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Greeting greeting(@PathVariable String name) {
		if (StringUtils.isEmpty(name)){
			return new Greeting(counter.incrementAndGet(),String.format(template, "world"));
		}else{
			return new Greeting(counter.incrementAndGet(),String.format(template, name));
		}
	}
	
	//url
	//http://localhost:8080/CrunchifySpringMVCTutorial/rest/speak
	@RequestMapping("")
	public @ResponseBody Greeting greeting1() {		
		return new Greeting(counter.incrementAndGet(),String.format(template, "world"));		
	}
}

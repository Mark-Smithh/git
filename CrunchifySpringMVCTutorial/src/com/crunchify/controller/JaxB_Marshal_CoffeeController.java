package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crunchify.process.Coffee;

@Controller
@RequestMapping("/coffee")
public class JaxB_Marshal_CoffeeController {
	
	//url
	//http://localhost:8080/CrunchifySpringMVCTutorial/jaxBee/coffee/Vanilla
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Coffee getCoffeeInXML(@PathVariable String name) {
		Coffee coffee = new Coffee(name, 100);		
		return coffee;
	}

}

package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mark.core.JaxBUnmarshMarsh;

@Controller
public class JaxBUnmarshMarshController {
	@RequestMapping("/jax")
	public ModelAndView doIt(){		
		JaxBUnmarshMarsh jax = new JaxBUnmarshMarsh();
		ModelAndView mav = new ModelAndView("jax","jax",jax);
		return mav;
	}
	
}

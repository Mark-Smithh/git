package com.crunchify.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crunchify.process.GetNames;

@Controller
public class MarkSmithController {	
	@RequestMapping("/mark")
	public ModelAndView doIt(){
		GetNames gN = new GetNames();
		gN.getThem();	
		gN.setNameList(new ArrayList<String>());
		gN.setNameMap(new HashMap<String,String>());
		ModelAndView mav = new ModelAndView("mark","gN",gN);
		mav.addObject("lists", gN.getNameList());		
		mav.addObject("nameMap", gN.getNameMap());
		return mav;		
	}
}

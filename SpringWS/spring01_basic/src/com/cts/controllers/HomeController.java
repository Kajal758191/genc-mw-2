package com.cts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("greet")
	public ModelAndView sayHello1() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("msg", "Welcome User...");
		return mv;
	}
	@RequestMapping("greet/{name}")
	public ModelAndView sayHello2(@PathVariable String name) {
		ModelAndView mv = new ModelAndView("hello");
		System.out.println("Welcome "+name);
		mv.addObject("msg", "Welcome "+name+"...");
		return mv;
	}
	
	
	
}

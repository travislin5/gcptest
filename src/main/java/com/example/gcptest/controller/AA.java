package com.example.gcptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class AA {

	@GetMapping("/a")
	public String aa() {
		return "123";
	}

	 @GetMapping("/b")
	    public String aaa() {
	        return "welcomae";
	    }
	 
	 @RequestMapping("/c")
	  public ModelAndView viewBooks(ModelAndView model) {

	    model.setViewName("bb");
	    return model;
	  }

}

package com.spring_mvc.second;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale,Model model) {
		return "index";
	}
	
	@RequestMapping("/myView")
	public String myView() {
		return "jsp/myView"; 
	}

}

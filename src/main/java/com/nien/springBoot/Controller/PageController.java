package com.nien.springBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

	@RequestMapping(value="/getIndex", method = RequestMethod.GET)
	public String indexPage(Model model){
		System.out.println("I am Nick~~~");
		model.addAttribute("name", "I am Nick~~~");		
		return "index";
	}	
}

package com.dindar.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/sillyForm")
	public String sillyForm() {
		return "sillyForm";
	}
	
	@RequestMapping("/procesSilly")
	public String processSilly(HttpServletRequest request, Model model) {
		String name= request.getParameter("studentName");
		name= "Yo " +  name.toUpperCase();
		
		model.addAttribute("message",name);
		return "sillyView";
	}
	
	
}

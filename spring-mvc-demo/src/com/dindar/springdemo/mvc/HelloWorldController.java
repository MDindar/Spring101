package com.dindar.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/makeUppercase")
	//public String makeUppercase(HttpServletRequest request, Model model) {
	public String makeUppercase(@RequestParam("studentName")String name, Model model) {
		
		/*String name= request.getParameter("studentName");
		name= "Yo " +  name.toUpperCase();*/
		
		model.addAttribute("message",name);
		return "helloworld";
	}
}

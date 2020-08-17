package com.MGProject.JobPosting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController{
   
	@GetMapping("userLogin")
	public String userLogin() {
		
		return "userLogin";
	}
	
	@GetMapping("companyLogin")
	public String companyLogin() {
		
		return "companyLogin";
	}
	
}
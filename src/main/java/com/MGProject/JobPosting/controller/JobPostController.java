package com.MGProject.JobPosting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.MGProject.JobPosting.model.Address;
import com.MGProject.JobPosting.model.Job;
import com.MGProject.JobPosting.service.JobService;


@Controller
public class JobPostController{
	@Autowired
	private JobService jobManger;
	
	@Autowired
	private Address addr;
	
	
	@RequestMapping("companyLogin/jobPost")
	public String getJob() {
		return "jobPost";
	}
	
//	@PostMapping("/companyLogin/postJob")
//	@ResponseBody
//	public String addJob(String title, String cName, String city, String state, String zipcode, String country,
//	                          double salary, String require, String description) {
//         jobManger.addJob(title, cName, city, state, zipcode, country, salary, require, description);
//         return "you successfully added a job";
//	}
	
	@PostMapping("/companyLogin/postJob")
	@ResponseBody
	public String addJob(Job job, Address address) {
		jobManger.addJob(job, address);
		return "success";
	}
	
	

	
	@RequestMapping("companyLogin/view")
	public String viewJob(Model model) {
		List<Job> jobs =jobManger.getListOfjob();
		System.out.println(jobs);
		model.addAttribute("job", jobs);
		addr.test();
		return "testViewJob";
	}
}
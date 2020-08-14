package com.MGProject.JobPosting.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.MGProject.JobPosting.model.Address;
import com.MGProject.JobPosting.model.Job;



@Service
public class JobService{
	
	// the list contians a list of jobs added a company
	List<Job> jobs = new ArrayList<>();	
	
//   public void addJob(String title, String cName, String city, String state, String zipcode, String country,
//            double salary, String require, String description) {
//		Address address = new Address(city, state, zipcode, country);
//	   Job job = new Job(title, cName, salary, require, description, false, address);
//	   jobs.add(job);   
//   }
//   
   public void addJob(Job j, Address a) {
	   j.setAddress(a);
	   jobs.add(j);
   }
   
   public List<Job> getListOfjob(){
	   return jobs;
   }
   
}

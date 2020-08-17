package com.MGProject.JobPosting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanySignupController{

    @GetMapping("CompanyLogin")
    public String login(){

        return "companyLogin";
    }
}
package com.MGProject.JobPosting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyLoginController {

    @GetMapping("CompanySignup")
    public String signUp(){

        return "companySignup";
    }
}
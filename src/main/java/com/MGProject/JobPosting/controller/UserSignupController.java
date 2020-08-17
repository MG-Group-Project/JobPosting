package com.MGProject.JobPosting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserSignupController{

    @GetMapping("UserLogin")
    public String login(){

        return "userLogin";
    }
}
package com.MGProject.JobPosting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLoginController{

    @GetMapping("UserSignup")
    public String signUp(){

      return "userSignup";
    }
}
package com.pillar.com.pillar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testThymeleaf {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(){
        return "index";
    }
}


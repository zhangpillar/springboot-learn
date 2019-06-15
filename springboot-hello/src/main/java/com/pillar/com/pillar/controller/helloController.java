package com.pillar.com.pillar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/index")
    public String index(){
        return "hello world!";
    }
}

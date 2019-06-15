package com.pillar.com.pillar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testFreemarker {
    @RequestMapping("/testFreemarker")
    public String testFreemarker(Model model){
        model.addAttribute("name","hello pillar");
        return "index";
    }
}

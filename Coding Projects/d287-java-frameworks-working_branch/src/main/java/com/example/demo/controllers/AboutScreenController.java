package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutScreenController {
    @GetMapping("/aboutscreen")
    public String template(){
        return "aboutscreen";
    }


}

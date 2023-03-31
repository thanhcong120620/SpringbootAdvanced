package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String viewCusHistoryIndex(Model model) {
        String msg = "Hello world";
        model.addAttribute("msg",msg);

        return "helloworld";
    }

}

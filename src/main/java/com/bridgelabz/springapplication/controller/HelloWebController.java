package com.bridgelabz.springapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String messages(Model model) {
        model.addAttribute("message", "This is custom message");
        return "message";

    }
}

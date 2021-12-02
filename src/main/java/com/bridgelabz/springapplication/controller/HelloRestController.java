package com.bridgelabz.springapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET
    )
    public String index(){
        return "Hello from Bridgelabz";
    }
}

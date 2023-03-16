package com.springproject.firstapp.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${message.helloText}")
    private String helloText;

    // Used to access the properties in application.properties
    @Autowired
    private Environment env;

    @GetMapping("/")
    public String sayHello() {
        return helloText + " " + env.getProperty("user.name");
    }

}

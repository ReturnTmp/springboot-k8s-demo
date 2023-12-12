package com.example.springbootk8sdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloK8sController {

    @GetMapping("/hello")
    public String helloK8s() {
        return "Hello K8s!";
    }
}

package com.example.swyptest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class TestController {

    @GetMapping("/test")
    public String testController(){
        return "ci/cd completed";
    }
}

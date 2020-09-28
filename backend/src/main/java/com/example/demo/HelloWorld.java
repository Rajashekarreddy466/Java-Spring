package com.example.demo;
import org.springframework.web.bind.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        return "Hello World!!";
    }

}

package com.example.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/") // This maps the root URL to this method
    public String hello() {
        return "Hello, Worrrrrreeeerrrrrld!";
    }
}

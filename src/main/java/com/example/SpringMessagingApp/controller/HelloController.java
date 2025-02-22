package com.example.SpringMessagingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}

package com.example.SpringMessagingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}

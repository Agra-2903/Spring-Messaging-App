package com.example.SpringMessagingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

<<<<<<< HEAD
    // GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name) {
=======
    // GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
>>>>>>> UC3
        return "Hello " + name + " from BridgeLabz!";
    }
}

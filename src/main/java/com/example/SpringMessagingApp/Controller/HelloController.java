package com.example.SpringMessagingApp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // 1️⃣ GET Request: Default Hello Message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // 2️⃣ GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // 3️⃣ GET Request with Path Variable
    @GetMapping("/path/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // 4️⃣ POST Request
    @PostMapping
    public String postHello(@RequestBody String name) {
        return "Hello " + name + ", you sent a POST request!";
    }

    // 5️⃣ PUT Request
    @PutMapping("/{name}")
    public String putHello(@PathVariable String name) {
        return "Hello " + name + ", you sent a PUT request!";
    }

    // 6️⃣ DELETE Request
    @DeleteMapping("/{name}")
    public String deleteHello(@PathVariable String name) {
        return "Goodbye " + name + ", your DELETE request was received!";
    }
}

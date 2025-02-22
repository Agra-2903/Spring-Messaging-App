package com.example.SpringMessagingApp.controller;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.example.SpringMessagingApp.model.User;
>>>>>>> UC4
=======
>>>>>>> UC5
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
    // POST Request that accepts User object in the request body
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
>>>>>>> UC4
=======
    // PUT Request with Path Variable and Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
>>>>>>> UC5
    }
}

package com.nabha.learning.nabhaLearning_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Yeh class JSON/Text responses bhejegi (APIs ke liye)
public class HelloController {

    @GetMapping("/hello")  // Browser/Postman se GET http://localhost:8080/hello hit karo
    public String hello() {
        return "Nabha Learning Backend Ready! Frontend Integration Starting Soon (Day 3).";
    }
}
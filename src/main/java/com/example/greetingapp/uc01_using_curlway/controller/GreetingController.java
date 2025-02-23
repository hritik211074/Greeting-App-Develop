package com.example.greetingapp.uc01_using_curlway.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getGreeting() {
        return ResponseEntity.ok(Map.of("message", "Hello from GET!"));
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> postGreeting() {
        return ResponseEntity.ok(Map.of("message", "Hello from POST!"));
    }

    @PutMapping
    public ResponseEntity<Map<String, String>> putGreeting() {
        return ResponseEntity.ok(Map.of("message", "Hello from PUT!"));
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> deleteGreeting() {
        return ResponseEntity.ok(Map.of("message", "Hello from DELETE!"));
    }
}

package com.example.greetingapp.uc03_ability_greeting.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbilityController {

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "first_name", required = false) String firstName,
                        @RequestParam(value = "last_name", required = false) String lastName) {

        // Case 1: Both first and last names provided
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        }

        // Case 2: Only first name or last name provided
        if (firstName != null) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null) {
            return "Hello, " + lastName + "!";
        }
        // Case 3: No name provided
        return "Hello, World!";
    }
}

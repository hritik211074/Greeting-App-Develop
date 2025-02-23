package com.example.greetingapp.uc04save_greeting_message.controller;

import com.example.greetingapp.uc04save_greeting_message.model.Greeting;
import com.example.greetingapp.uc04save_greeting_message.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveController {

    // In-memory greeting repository (no database)
    private final GreetingRepository greetingRepository = new GreetingRepository();

    // GET method to greet user and save message to repository
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "first_name", required = false) String firstName,
                        @RequestParam(value = "last_name", required = false) String lastName) {

        String greetingMessage;

        // Case 1: Both first and last names provided
        if (firstName != null && lastName != null) {
            greetingMessage = "Hello, " + firstName + " " + lastName + "!";
        }
        // Case 2: Only first name or last name provided
        else if (firstName != null) {
            greetingMessage = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            greetingMessage = "Hello, " + lastName + "!";
        }
        // Case 3: No name provided
        else {
            greetingMessage = "Hello, World!";
        }

        // Save the greeting message in the in-memory repository
        Greeting greeting = new Greeting(greetingMessage);
        greetingRepository.save(greeting);

        return greetingMessage;  // Return the greeting message
    }

    // POST method to greet user and save message to repository
    @PostMapping("/greet")
    public String postGreet(@RequestParam(value = "first_name", required = false) String firstName,
                            @RequestParam(value = "last_name", required = false) String lastName) {

        String greetingMessage;

        // Case 1: Both first and last names provided
        if (firstName != null && lastName != null) {
            greetingMessage = "Hello, " + firstName + " " + lastName + "!";
        }
        // Case 2: Only first name or last name provided
        else if (firstName != null) {
            greetingMessage = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            greetingMessage = "Hello, " + lastName + "!";
        }
        // Case 3: No name provided
        else {
            greetingMessage = "Hello, World!";
        }

        // Save the greeting message in the in-memory repository
        Greeting greeting = new Greeting(greetingMessage);
        greetingRepository.save(greeting);

        return greetingMessage;  // Return the greeting message
    }
}

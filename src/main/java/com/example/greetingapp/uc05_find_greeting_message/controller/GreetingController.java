package com.example.greetingapp.uc05_find_greeting_message.controller;

import com.example.greetingapp.uc05_find_greeting_message.model.Greeting;
import com.example.greetingapp.uc05_find_greeting_message.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {

    // In-memory greeting repository (no database)
    private final GreetingRepository greetingRepository = new GreetingRepository();

    // GET method to greet user and save message to repository
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "first_name", required = false) String firstName,
                        @RequestParam(value = "last_name", required = false) String lastName) {

        String greetingMessage;

        if (firstName != null && lastName != null) {
            greetingMessage = "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            greetingMessage = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            greetingMessage = "Hello, " + lastName + "!";
        } else {
            greetingMessage = "Hello, World!";
        }

        // Save the greeting message in the in-memory repository
        Greeting greeting = new Greeting(null, greetingMessage);
        greetingRepository.save(greeting);

        return greetingMessage;  // Return the greeting message
    }

    // GET method to find a greeting message by ID
    @GetMapping("/greetById")
    public String greetById(@RequestParam(value = "id") Long id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);

        if (greeting.isPresent()) {
            return "Greeting found: " + greeting.get().getMessage();
        } else {
            return "Greeting not found for ID: " + id;
        }
    }
}

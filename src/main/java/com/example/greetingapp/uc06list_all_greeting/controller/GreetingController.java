package com.example.greetingapp.uc06list_all_greetings.controller;

import com.example.greetingapp.uc06list_all_greetings.model.Greeting;
import com.example.greetingapp.uc06list_all_greetings.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    // In-memory greeting repository (no database)
    private final GreetingRepository greetingRepository = new GreetingRepository();

    // GET method to greet user and save message to repository
    @GetMapping("/greet")
    public String greet(String firstName, String lastName) {
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

    // GET method to list all greeting messages
    @GetMapping("/greetings")
    public List<Greeting> listAllGreetings() {
        return greetingRepository.findAll();  // Return all greeting messages stored in the repository
    }
}

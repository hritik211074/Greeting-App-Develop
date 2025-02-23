package com.example.greetingapp.uc07edit_greeting.controller;

import com.example.greetingapp.uc07edit_greeting.model.Greeting;
import com.example.greetingapp.uc07edit_greeting.repository.GreetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // GET method to list all greeting messages
    @GetMapping("/greetings")
    public List<Greeting> listAllGreetings() {
        return greetingRepository.findAll();  // Return all greeting messages stored in the repository
    }

    // PUT method to edit a greeting by ID
    @PutMapping("/greet/{id}")
    public String editGreeting(@PathVariable Long id, @RequestParam String newMessage) {
        boolean updated = greetingRepository.editGreeting(id, newMessage);

        if (updated) {
            return "Greeting with ID " + id + " has been updated successfully!";
        } else {
            return "Greeting with ID " + id + " not found!";
        }
    }
}

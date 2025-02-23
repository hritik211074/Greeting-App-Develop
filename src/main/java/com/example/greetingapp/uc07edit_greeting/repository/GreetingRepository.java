package com.example.greetingapp.uc07edit_greeting.repository;

import com.example.greetingapp.uc07edit_greeting.model.Greeting;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GreetingRepository {

    // In-memory storage (simple list)
    private List<Greeting> greetings = new ArrayList<>();
    private static Long idCounter = 1L;  // Static counter for generating unique IDs

    // Save greeting message to in-memory list
    public void save(Greeting greeting) {
        greeting.setId(idCounter++);
        greetings.add(greeting);
    }

    // Find a greeting by ID
    public Optional<Greeting> findById(Long id) {
        return greetings.stream().filter(g -> g.getId().equals(id)).findFirst();
    }

    // Find all greeting messages
    public List<Greeting> findAll() {
        return greetings;
    }

    // Edit greeting by ID
    public boolean editGreeting(Long id, String newMessage) {
        Optional<Greeting> greeting = findById(id);
        if (greeting.isPresent()) {
            greeting.get().setMessage(newMessage);  // Update the message
            return true;
        }
        return false;  // If greeting not found, return false
    }
}

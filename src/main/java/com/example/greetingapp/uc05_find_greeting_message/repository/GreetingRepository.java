package com.example.greetingapp.uc05_find_greeting_message.repository;

import com.example.greetingapp.uc05_find_greeting_message.model.Greeting;
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

    // Find greeting by ID
    public Optional<Greeting> findById(Long id) {
        return greetings.stream().filter(g -> g.getId().equals(id)).findFirst();
    }

    // Get all greeting messages (optional)
    public List<Greeting> findAll() {
        return greetings;
    }
}

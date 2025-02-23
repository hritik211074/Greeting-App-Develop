package com.example.greetingapp.uc06list_all_greetings.repository;

import com.example.greetingapp.uc06list_all_greetings.model.Greeting;
import java.util.ArrayList;
import java.util.List;

public class GreetingRepository {

    // In-memory storage (simple list)
    private List<Greeting> greetings = new ArrayList<>();
    private static Long idCounter = 1L;  // Static counter for generating unique IDs

    // Save greeting message to in-memory list
    public void save(Greeting greeting) {
        greeting.setId(idCounter++);
        greetings.add(greeting);
    }

    // Find all greeting messages
    public List<Greeting> findAll() {
        return greetings;
    }
}

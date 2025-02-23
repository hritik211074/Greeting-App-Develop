package com.example.greetingapp.uc04save_greeting_message.repository;

import com.example.greetingapp.uc04save_greeting_message.model.Greeting;
import java.util.ArrayList;
import java.util.List;

public class GreetingRepository {

    // In-memory storage (simple list)
    private List<Greeting> greetings = new ArrayList<>();

    // Save greeting message to in-memory list
    public void save(Greeting greeting) {
        greetings.add(greeting);
    }

    // Get all greeting messages (optional)
    public List<Greeting> findAll() {
        return greetings;
    }
}

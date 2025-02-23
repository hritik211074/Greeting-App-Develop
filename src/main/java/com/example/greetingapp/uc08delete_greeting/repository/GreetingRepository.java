package com.example.greetingapp.uc08delete_greeting.repository;

import java.util.*;
import com.example.greetingapp.uc08delete_greeting.model.Greeting;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;public class GreetingRepository {
    private final Map<Long, Greeting> greetings = new HashMap<>();
    private long idCounter = 1;

    public void save(Greeting greeting) {
        greeting.setId(idCounter++);
        greetings.put(greeting.getId(), greeting);
    }

    public List<Greeting> findAll() {
        return new ArrayList<>(greetings.values());
    }

    public boolean editGreeting(Long id, String newMessage) {
        Greeting greeting = greetings.get(id);
        if (greeting != null) {
            greeting.setMessage(newMessage);
            return true;
        }
        return false;
    }

    public boolean deleteGreeting(Long id) {
        return greetings.remove(id) != null;
    }
}

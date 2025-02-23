package com.example.greetingapp.uc06list_all_greetings.model;

public class Greeting {

    private Long id;
    private String message;

    // Constructor
    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

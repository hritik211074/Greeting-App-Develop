package com.example.greetingapp.uc04save_greeting_message.model;
public class Greeting {

    private String message;

    // Constructor
    public Greeting(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }
    // Setter
    public void setMessage(String message) {
        this.message = message;
    }
}


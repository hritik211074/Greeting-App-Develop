package com.example.greetingapp.uc05_find_greeting_message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindGreetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.greetingapp.uc04save_greeting_message.SaveApplication.class, args);
    }
}

package com.example.greetingapp.uc03_ability_greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.greetingapp.uc02_greet_message.ServicesLayerApplication.class, args);
    }
}

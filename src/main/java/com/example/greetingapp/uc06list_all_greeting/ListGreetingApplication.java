package com.example.greetingapp.uc06list_all_greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListGreetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.greetingapp.uc08delete_greeting.SaveApplication.class, args);
    }
}

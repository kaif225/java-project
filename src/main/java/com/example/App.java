package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String hello() {
        return "Hello from Azure DevOps CI/CD Pipeline!\nMaven Build Successful";
    }

    @GetMapping("/api/health")
    public String health() {
        return "{\"status\": \"UP\"}";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

package com.example.praktikum1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.praktikum1", "com.deploy.praktikum1"})
public class Praktikum1Application {
    public static void main(String[] args) {
        SpringApplication.run(Praktikum1Application.class, args);
    }
}
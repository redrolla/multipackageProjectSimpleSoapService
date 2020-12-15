package com.example.secondservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationFromModuleTwo {
    public static void main(String[] args) {
        System.out.println("Module 2 started.");
        SpringApplication.run(ApplicationFromModuleTwo.class, args);
    }
}

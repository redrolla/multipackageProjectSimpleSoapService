package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplicationModuleOne {

    public static void main(String[] args) {
        System.out.println("Module 1 started");
        SpringApplication.run(RestServiceApplicationModuleOne.class, args);
    }
}

package com.example.use_eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UseEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseEurakeApplication.class, args);
    }
}

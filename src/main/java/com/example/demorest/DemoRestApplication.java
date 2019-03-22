package com.example.demorest;

import com.example.demorest.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


@SpringBootApplication
public class DemoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRestApplication.class, args);
    }
}

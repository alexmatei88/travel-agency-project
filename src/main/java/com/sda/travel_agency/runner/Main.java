package com.sda.travel_agency.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sda.travel_agency")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}

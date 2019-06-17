package com.jacobfrancois.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jacobfrancois.persistance")
@EntityScan(basePackages = "com.jacobfrancois.domain")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

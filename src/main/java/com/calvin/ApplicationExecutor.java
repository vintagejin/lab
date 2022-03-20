package com.calvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationExecutor {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationExecutor.class);
        application.run(args);
    }

}

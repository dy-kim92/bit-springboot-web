package com.example.academy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing      //  날짜값 자동완성하기 위해 필요함
@SpringBootApplication
public class Application {  //  Java Persistence API

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
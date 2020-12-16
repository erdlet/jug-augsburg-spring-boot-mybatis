package com.innoq.talks.mybatisspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisSpringBootApplication implements CommandLineRunner {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void run(String... args) throws Exception {
        // TODO: Call Mapper methods to explore the functionality
    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootApplication.class, args);
    }
}

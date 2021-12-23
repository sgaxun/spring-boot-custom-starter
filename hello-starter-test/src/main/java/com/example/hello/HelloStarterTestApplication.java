package com.example.hello;

import org.example.config.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class HelloStarterTestApplication implements CommandLineRunner {

    @Resource
    HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(HelloStarterTestApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.helloService.getMsg());
    }
}

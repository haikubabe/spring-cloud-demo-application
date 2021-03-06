package com.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoodbyeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodbyeServiceApplication.class, args);
    }

    @RequestMapping("/")
    public String sayGoodbye() {
        return "Goodbye!!!";
    }
}

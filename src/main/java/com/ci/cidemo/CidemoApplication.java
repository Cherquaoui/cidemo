package com.ci.cidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CidemoApplication {

    public static void main(String[] args) {

        System.out.println("hello maven!");
        System.out.println("how are you?");
        SpringApplication.run(CidemoApplication.class, args);
    }

}

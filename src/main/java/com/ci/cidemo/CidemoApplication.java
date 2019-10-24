package com.ci.cidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CidemoApplication {

    public static void main(String[] args) {

        System.out.println("hello maven");
        SpringApplication.run(CidemoApplication.class, args);
    }

}

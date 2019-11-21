package com.coding.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
    Dependency Injection (DI)

    When writing a complex Java application, application classes should be as independent
    as possible of other Java classes to increase the possibility to reuse these classes and
    to test them independently of other classes while unit testing. Dependency Injection helps
    in gluing these classes together and at the same time keeping them independent.


 */

@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }

}

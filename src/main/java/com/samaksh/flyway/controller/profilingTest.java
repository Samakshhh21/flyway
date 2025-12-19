package com.samaksh.flyway.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class profilingTest {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @PostConstruct
    public void fun(){
        System.out.println(username + " " + password);
    }
}

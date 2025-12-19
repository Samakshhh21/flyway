package com.samaksh.flyway.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class profilingTest {

    @PostConstruct
    public void fun(){
        System.out.println();
    }
}

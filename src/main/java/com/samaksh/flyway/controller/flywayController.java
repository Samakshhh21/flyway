package com.samaksh.flyway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class flywayController {
    @GetMapping("/get")
    String getname(@RequestParam(value = "name") String user){
        return "welcome "+user+" !!";
    }
}

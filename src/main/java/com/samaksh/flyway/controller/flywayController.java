package com.samaksh.flyway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class flywayController {
    @Autowired
    random ran;

    @GetMapping("/get")
    String getname(@RequestParam(value = "name") String user){
        return "welcome "+user+" !!";
    }

    @GetMapping("/getmovie/{id}")
    String getmovie(@PathVariable(value = "id") String id){
        return "movie "+id+" !!";
    }

}

package com.samaksh.flyway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class flywayController {
    @Autowired
    random ran;

    @Autowired
    testing t;
     @Autowired
     testing2 t2;

    @Autowired
    testing t3;

    @Autowired
    testing2 t4;

    @GetMapping("/get")
    String getname(@RequestParam(value = "name") String user){
        return "welcome "+user+" !!";
    }
     flywayController(){
        System.out.println("flyway hashcode "+ this.hashCode());

     }
    @GetMapping("/getmovie/{id}")
    String getmovie(@PathVariable(value = "id") String id){
        return "movie "+id+" !!";
    }

}

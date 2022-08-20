package com.ProgradQuess.MicroServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @Autowired
    private Config config;
    @GetMapping("/Microservices")
    public Config func()
    {
        return new Config(config.getNum1(),config.getNum2());
    }

}

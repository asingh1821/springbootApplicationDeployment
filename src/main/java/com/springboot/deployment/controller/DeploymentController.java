package com.springboot.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeploymentController {

    @GetMapping("/dep")
    public String printMessage(){
        return "deployment process completed......";
    }
}

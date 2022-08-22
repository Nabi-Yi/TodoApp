package com.codestates.practicegithubActiondeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }
}

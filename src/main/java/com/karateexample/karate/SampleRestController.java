package com.karateexample.karate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @PostMapping("/token")
    public String token() {
        return "token";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

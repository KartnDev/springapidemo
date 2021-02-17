package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/countdownHello")
    private Collection<String> getAll() {
        return List.of("one", "two", "three", "hello!");
    }


}

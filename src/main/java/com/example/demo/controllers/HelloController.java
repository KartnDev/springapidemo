package com.example.demo.controllers;

import com.example.demo.dto.User;
import com.example.demo.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/users")
    private Collection<String> getAll() {
        return List.of("one", "two", "three", "hello!");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    private Collection<User> getUsers(){

        return userRepository.loadUsers();
    }

}

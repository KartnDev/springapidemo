package com.example.demo.controllers;

import com.example.demo.dto.User;
import com.example.demo.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public Collection<User> getUsers(){
        Collection<User> result = userRepository.loadUsers();


        return result;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public Collection<User> createUser(){
        Collection<User> result = userRepository.loadUsers();


        return result;
    }


}

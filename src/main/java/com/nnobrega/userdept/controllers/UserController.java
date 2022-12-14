package com.nnobrega.userdept.controllers;

import com.nnobrega.userdept.entities.User;
import com.nnobrega.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userRepository.save(user);
    }

}

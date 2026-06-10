package com.supreme.bitewise_backend.controller;


import com.supreme.bitewise_backend.model.Users;
import com.supreme.bitewise_backend.repository.UsersRepo;
import com.supreme.bitewise_backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UsersRepo repo;

    @Autowired
    UsersService service;

    @GetMapping("/")
    String home() {
        return "Welcome";
    }

    @GetMapping("/login")
    String login(@RequestBody Users user) {
        System.out.println(user);
        return service.verify(user);
    }

    @PostMapping("/register")
    Users registerUser(@RequestBody Users user) {
        return service.registerUser(user);
    }
}

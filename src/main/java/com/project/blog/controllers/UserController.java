package com.project.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.domain.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public /* @ResponseBody Iterable<User> */ String getUsers(RequestEntity request) {
        return userRepository.findAll().toString().concat(" ").concat(request.toString());
    }
}

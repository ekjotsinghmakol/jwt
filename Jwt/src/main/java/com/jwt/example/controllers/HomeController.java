package com.jwt.example.controllers;


import com.jwt.example.entities.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    public UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("Getting users");
        return  userService.getUsers();
    }

}

package com.jwt.example.service;

import com.jwt.example.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {


    public List<User> store = new ArrayList<>();


    public List<User> getUsers(){
        return this.store;
    }



}

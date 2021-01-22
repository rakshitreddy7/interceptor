package com.rakshit.interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers() {

        final List<String> users = new ArrayList<>();

        users.add("Jack Ma");
        users.add("Elon Musk");
        users.add("Satoshi Nakamoto");
        users.add("Neo");

        return users;
    }
}

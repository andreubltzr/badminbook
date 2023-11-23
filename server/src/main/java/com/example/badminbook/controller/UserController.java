package com.example.badminbook.controller;

import com.example.badminbook.dto.UserDTO;
import com.example.badminbook.model.User;
import com.example.badminbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

//    Find all
    @GetMapping
    private List<User> findAllUsers() {
        return userService.findAllUsers();
    }

//    Create a user
    @PostMapping
    private User createUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        return userService.createUser(userDTO);
    }
}

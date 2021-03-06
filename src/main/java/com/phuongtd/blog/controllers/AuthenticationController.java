package com.phuongtd.blog.controllers;

import com.phuongtd.blog.entities.Login;
import com.phuongtd.blog.entities.User;
import com.phuongtd.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Login login) throws Exception {
        return userService.login(login);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return  userService.register(user);
    }
}

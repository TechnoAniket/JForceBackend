package com.Jforce.Attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Jforce.Attendance.dto.LoginReq;
import com.Jforce.Attendance.entity.Role;
import com.Jforce.Attendance.entity.User;
import com.Jforce.Attendance.exception.UnauthorizedException;
import com.Jforce.Attendance.service.UserService;

@RestController
@RequestMapping("/Jforce/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listOfUser")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/registerUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/userByname/{username}")
    public User getByUserName(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping("/login")
    public Role login(@RequestBody LoginReq loginReq) throws UnauthorizedException {
        User user = userService.getUserByUsername(loginReq.getUsername());
        if (user != null && user.getPassword().equals(loginReq.getPassword())) {
            return user.getRole();
        } else {
            throw new UnauthorizedException("Invalid username or password");
        }
    }
    
}


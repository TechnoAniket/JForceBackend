package com.Jforce.Attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jforce.Attendance.entity.User;
import com.Jforce.Attendance.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(String username) {
        return userRepository.findByUsername(username);
    }


    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
}


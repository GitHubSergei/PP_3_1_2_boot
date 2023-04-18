package com.example.PP_3_1_2_boot.service;

import com.example.PP_3_1_2_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}


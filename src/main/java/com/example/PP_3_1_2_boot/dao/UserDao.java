package com.example.PP_3_1_2_boot.dao;

import com.example.PP_3_1_2_boot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}


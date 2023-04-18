package com.example.PP_3_1_2_boot.service;

import com.example.PP_3_1_2_boot.dao.UserDao;
import com.example.PP_3_1_2_boot.dao.UserDaoImpl;
import com.example.PP_3_1_2_boot.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceDaoImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceDaoImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(int id, User user) {
        user.setId(id);
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}

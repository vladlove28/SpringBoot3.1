package com.example.springBoot.service;


import com.example.springBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(Integer id);

    void updateUser(User user);

    User readUser(Integer id);

}

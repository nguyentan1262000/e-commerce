package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
    User getByID(Integer id);
    void deleteUser(User user);
    void updateInfoUser(Integer id,User user);
}

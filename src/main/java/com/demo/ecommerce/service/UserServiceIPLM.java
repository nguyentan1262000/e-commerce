package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.UserDTO;
import com.demo.ecommerce.entity.User;
import com.demo.ecommerce.repository.BillRepository;
import com.demo.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIPLM implements UserService{
    @Autowired
    private UserRepository repository;


    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getByID(Integer id) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateInfoUser(Integer id, User user) {

    }
}

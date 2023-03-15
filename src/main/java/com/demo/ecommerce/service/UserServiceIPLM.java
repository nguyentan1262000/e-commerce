package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.UserDTO;
import com.demo.ecommerce.repository.BillRepository;
import com.demo.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIPLM implements UserService{
    @Autowired
    private UserRepository repository;

    @Override
    public List<UserDTO> getAllUser() {
        return null;
    }

    @Override
    public void addUser(UserDTO user) {

    }

    @Override
    public UserDTO getByID(Integer id) {
        return null;
    }

    @Override
    public void deleteUser(UserDTO user) {

    }

    @Override
    public void updateInfoUser(Integer id, UserDTO user) {

    }
}

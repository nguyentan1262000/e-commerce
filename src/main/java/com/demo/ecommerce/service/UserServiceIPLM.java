package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.User;
import com.demo.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIPLM implements UserService{
    @Autowired
    private UserRepository repository;


    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public void addUser(User user) {
        if (user != null){
            repository.save(user);
        }else {
            System.out.println("Khong co thuc the phu hop");
        }
    }

    @Override
    public User getByID(Integer id) {
        return repository.getById(id);
    }

    @Override
    public void deleteUser(User user) {
        repository.deleteById(user.getId_user());
    }

    @Override
    public void updateInfoUser(Integer id, User user) {
        if(user != null){
            User user1 = repository.getById(id);

            user1.setId_user(user.getId_user());
            user1.setUsername(user.getUsername());
            user1.setPassword(user.getPassword());
            user1.setEmail(user.getEmail());

            repository.save(user1);
        }
        else {
            System.out.println("thuc the khong hop le");
        }
    }
}

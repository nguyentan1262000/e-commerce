package com.demo.ecommerce.service;


import com.demo.ecommerce.DTO.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUser();
    void addUser(UserDTO user);
    UserDTO getByID(Integer id);
    void deleteUser(UserDTO user);
    void updateInfoUser(Integer id,UserDTO user);
}

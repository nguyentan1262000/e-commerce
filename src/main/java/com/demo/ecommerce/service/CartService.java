package com.demo.ecommerce.service;


import com.demo.ecommerce.DTO.ClientCartDTO;
import com.demo.ecommerce.DTO.ProductDTO;

import java.util.List;

public interface CartService {
    List<ClientCartDTO> getAllCart();
    void addCart(ClientCartDTO cartDTO);
    ClientCartDTO getByID(Integer id_product);
    void deleteCart(ClientCartDTO cart);
    void updateCart(Integer id,ClientCartDTO cart);
}

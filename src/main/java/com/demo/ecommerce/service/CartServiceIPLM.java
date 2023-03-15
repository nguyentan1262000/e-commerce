package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.ClientCartDTO;
import com.demo.ecommerce.repository.ClientCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceIPLM implements CartService{
    @Autowired
    private ClientCartRepository repository;
    @Override
    public List<ClientCartDTO> getAllCart() {
        return null;
    }

    @Override
    public void addCart(ClientCartDTO cartDTO) {

    }

    @Override
    public ClientCartDTO getByID(Integer id_product) {
        return null;
    }

    @Override
    public void deleteCart(ClientCartDTO cart) {

    }

    @Override
    public void updateCart(Integer id, ClientCartDTO cart) {

    }
}

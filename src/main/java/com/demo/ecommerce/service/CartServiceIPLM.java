package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.ClientCart;
import com.demo.ecommerce.repository.ClientCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceIPLM implements CartService{
    @Autowired
    private ClientCartRepository repository;

    @Override
    public List<ClientCart> getAllCart() {
        return null;
    }

    @Override
    public void addCart(ClientCart cartDTO) {

    }

    @Override
    public ClientCart getByID(Integer id_product) {
        return null;
    }

    @Override
    public void deleteCart(ClientCart cart) {

    }

    @Override
    public void updateCart(Integer id, ClientCart cart) {

    }
}

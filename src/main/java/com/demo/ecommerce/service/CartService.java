package com.demo.ecommerce.service;



import com.demo.ecommerce.entity.ClientCart;

import java.util.List;

public interface CartService {
    List<ClientCart> getAllCart();
    void addCart(ClientCart cartDTO);
    ClientCart getByID(Integer id_product);
    void deleteCart(ClientCart cart);
    void updateCart(Integer id,ClientCart cart);
}

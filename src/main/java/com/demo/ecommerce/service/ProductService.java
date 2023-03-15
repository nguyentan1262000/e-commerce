package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    void addProduct(Product product);
    Product getByID(Integer id_product);
    void deleteProduct(Product product);
    void updateProduct(Integer id,Product product);
}

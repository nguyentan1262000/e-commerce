package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.Product;
import com.demo.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIPLM implements ProductService{
    @Autowired
    private ProductRepository repository;


    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product getByID(Integer id_product) {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void updateProduct(Integer id, Product product) {

    }
}

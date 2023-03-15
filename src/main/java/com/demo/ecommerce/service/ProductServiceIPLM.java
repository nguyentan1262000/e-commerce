package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.ProductDTO;
import com.demo.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIPLM implements ProductService{
    @Autowired
    private ProductRepository repository;

    @Override
    public List<ProductDTO> getAllProduct() {
        return null;
    }

    @Override
    public void addProduct(ProductDTO product) {

    }

    @Override
    public ProductDTO getByID(Integer id_product) {
        return null;
    }

    @Override
    public void deleteProduct(ProductDTO product) {

    }

    @Override
    public void updateProduct(Integer id, ProductDTO product) {

    }
}

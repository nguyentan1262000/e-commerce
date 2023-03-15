package com.demo.ecommerce.service;


import com.demo.ecommerce.DTO.ProductDTO;
import com.demo.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProduct();
    void addProduct(ProductDTO product);
    ProductDTO getByID(Integer id_product);
    void deleteProduct(ProductDTO product);
    void updateProduct(Integer id,ProductDTO product);
}

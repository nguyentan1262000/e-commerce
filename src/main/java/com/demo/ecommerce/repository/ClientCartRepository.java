package com.demo.ecommerce.repository;

import com.demo.ecommerce.DTO.ClientCartDTO;
import com.demo.ecommerce.entity.ClientCart;
import com.demo.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCartRepository extends JpaRepository<ClientCart,Integer> {
}

package com.demo.ecommerce.repository;

import com.demo.ecommerce.entity.Bill_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillUserRepository extends JpaRepository<Bill_User,Integer> {
}

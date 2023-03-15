package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.BillUserDTO;
import com.demo.ecommerce.entity.Bill_User;
import com.demo.ecommerce.repository.BillUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillUserServiceIPLM implements BillUserService{
    @Autowired
    private BillUserRepository repository;

    @Override
    public List<Bill_User> getAllBillUser() {
        return null;
    }

    @Override
    public void addBillUser(Bill_User bill_user) {

    }

    @Override
    public Bill_User getByID(Integer id) {
        return null;
    }

    @Override
    public void deleteBillUser(Bill_User bill_user) {

    }

    @Override
    public void updateInfoBillUser(Integer id, Bill_User bill_user) {

    }
}

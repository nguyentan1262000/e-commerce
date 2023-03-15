package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.BillUserDTO;
import com.demo.ecommerce.repository.BillUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillUserServiceIPLM implements BillUserService{
    @Autowired
    private BillUserRepository repository;
    @Override
    public List<BillUserDTO> getAllBillUser() {
        return null;
    }

    @Override
    public void addBillUser(BillUserDTO bill_user) {

    }

    @Override
    public BillUserDTO getByID(Integer id) {
        return null;
    }

    @Override
    public void deleteBillUser(BillUserDTO bill_user) {

    }

    @Override
    public void updateInfoBillUser(Integer id, BillUserDTO bill_user) {

    }
}

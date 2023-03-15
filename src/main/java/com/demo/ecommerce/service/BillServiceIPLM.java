package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.BillDTO;
import com.demo.ecommerce.entity.Bill;
import com.demo.ecommerce.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceIPLM implements BillService{
    @Autowired
    private BillRepository repository;


    @Override
    public List<Bill> getAllProduct() {
        return null;
    }

    @Override
    public void addBill(Bill bill) {

    }

    @Override
    public Bill getById(Integer id) {
        return null;
    }

    @Override
    public void deleteBill(Bill bill) {

    }

    @Override
    public void updateBill(Integer id, Bill bill) {

    }
}

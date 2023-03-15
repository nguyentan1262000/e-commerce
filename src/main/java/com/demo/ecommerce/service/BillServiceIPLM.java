package com.demo.ecommerce.service;

import com.demo.ecommerce.DTO.BillDTO;
import com.demo.ecommerce.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceIPLM implements BillService{
    @Autowired
    private BillRepository repository;

    @Override
    public List<BillDTO> getAllProduct() {
        return null;
    }

    @Override
    public void addBill(BillDTO bill) {

    }

    @Override
    public BillDTO getById(Integer id) {
        return null;
    }

    @Override
    public void deleteBill(BillDTO bill) {

    }

    @Override
    public void updateBill(Integer id, BillDTO bill) {

    }
}

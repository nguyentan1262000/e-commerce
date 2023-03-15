package com.demo.ecommerce.service;


import com.demo.ecommerce.DTO.BillDTO;

import java.util.List;

public interface BillService {
    List<BillDTO> getAllProduct();
    void addBill(BillDTO bill);
    BillDTO getById(Integer id);
    void deleteBill(BillDTO bill);
    void updateBill(Integer id,BillDTO bill);
}

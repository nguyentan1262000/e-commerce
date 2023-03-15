package com.demo.ecommerce.service;




import com.demo.ecommerce.entity.Bill;

import java.util.List;

public interface BillService {
    List<Bill> getAllProduct();
    void addBill(Bill bill);
    Bill getById(Integer id);
    void deleteBill(Bill bill);
    void updateBill(Integer id,Bill bill);
}

package com.demo.ecommerce.service;


import com.demo.ecommerce.entity.Bill_User;

import java.util.List;

public interface BillUserService {
    List<Bill_User> getAllBillUser();
    void addBillUser(Bill_User bill_user);
    Bill_User getByID(Integer id);
    void deleteBillUser(Bill_User bill_user);
    void updateInfoBillUser(Integer id,Bill_User bill_user);
}

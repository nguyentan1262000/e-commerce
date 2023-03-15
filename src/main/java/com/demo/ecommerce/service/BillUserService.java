package com.demo.ecommerce.service;



import com.demo.ecommerce.DTO.BillUserDTO;

import java.util.List;

public interface BillUserService {
    List<BillUserDTO> getAllBillUser();
    void addBillUser(BillUserDTO bill_user);
    BillUserDTO getByID(Integer id);
    void deleteBillUser(BillUserDTO bill_user);
    void updateInfoBillUser(Integer id,BillUserDTO bill_user);
}

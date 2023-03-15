package com.demo.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class BillUserDTO {
    private Integer id;
    private int user_id;
    private int bill_id;

    public BillUserDTO(Integer id, int user_id, int bill_id) {
        this.id = id;
        this.user_id = user_id;
        this.bill_id = bill_id;
    }
}

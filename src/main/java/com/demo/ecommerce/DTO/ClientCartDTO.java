package com.demo.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class ClientCartDTO {
    private Integer id;
    private String list_product;
    private int sum_price;

}

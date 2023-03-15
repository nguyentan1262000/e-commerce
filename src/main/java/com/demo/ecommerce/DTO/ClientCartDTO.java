package com.demo.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class ClientCartDTO {
    private Integer id;
    private String list_product;
    private int sum_price;

    public ClientCartDTO(Integer id, String list_product, int sum_price) {
        this.id = id;
        this.list_product = list_product;
        this.sum_price = sum_price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getList_product() {
        return list_product;
    }

    public void setList_product(String list_product) {
        this.list_product = list_product;
    }

    public int getSum_price() {
        return sum_price;
    }

    public void setSum_price(int sum_price) {
        this.sum_price = sum_price;
    }
}

package com.demo.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;

public class BillDTO {
    private Integer id;
    private String list_product;
    private Date date;
    private String sum_price;
    private int check_paid;

    public BillDTO(Integer id, String list_product, Date date, String sum_price, int check_paid) {
        this.id = id;
        this.list_product = list_product;
        this.date = date;
        this.sum_price = sum_price;
        this.check_paid = check_paid;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSum_price() {
        return sum_price;
    }

    public void setSum_price(String sum_price) {
        this.sum_price = sum_price;
    }

    public int getCheck_paid() {
        return check_paid;
    }

    public void setCheck_paid(int check_paid) {
        this.check_paid = check_paid;
    }
}

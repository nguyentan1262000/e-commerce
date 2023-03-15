package com.demo.ecommerce.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "list_product")
    @JdbcTypeCode(SqlTypes.JSON)
    private String list_product;

    @Column(name = "date", length = 10)
    @JdbcTypeCode(SqlTypes.DATE)
    private String date;

    @Column(name = "sum_price", length = 100)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private String sum_price;

    @Column(name = "check_paid", length = 5)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int check_paid;


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
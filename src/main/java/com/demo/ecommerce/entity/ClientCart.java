package com.demo.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "client_cart")
public class ClientCart {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "list_product")
    @JdbcTypeCode(SqlTypes.JSON)
    private String list_product;

    @Column(name = "sum_price", length = 50)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int sum_price;

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
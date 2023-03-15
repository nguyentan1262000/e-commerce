package com.demo.ecommerce.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name_product")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name_product;

    @Column(name = "type_product", length = 10)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int type_product;


    @Column(name = "price_product", length = 100)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int price_product;
    @Column(name = "quantity_product", length = 10)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int quantity_product;

    @Column(name = "describe_product")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String describe_product;

    @Column(name = "supplier_product")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String supplier_product;

    @Column(name = "list_image")
    @JdbcTypeCode(SqlTypes.JSON)
    private String list_image;

    @Column(name = "detail_product")
    @JdbcTypeCode(SqlTypes.JSON)
    private String detail_product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getType_product() {
        return type_product;
    }

    public void setType_product(int type_product) {
        this.type_product = type_product;
    }

    public int getPrice_product() {
        return price_product;
    }

    public void setPrice_product(int price_product) {
        this.price_product = price_product;
    }

    public int getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(int quantity_product) {
        this.quantity_product = quantity_product;
    }

    public String getDescribe_product() {
        return describe_product;
    }

    public void setDescribe_product(String describe_product) {
        this.describe_product = describe_product;
    }

    public String getSupplier_product() {
        return supplier_product;
    }

    public void setSupplier_product(String supplier_product) {
        this.supplier_product = supplier_product;
    }

    public String getList_image() {
        return list_image;
    }

    public void setList_image(String list_image) {
        this.list_image = list_image;
    }

    public String getDetail_product() {
        return detail_product;
    }

    public void setDetail_product(String detail_product) {
        this.detail_product = detail_product;
    }
}
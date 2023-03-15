package com.demo.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class ProductDTO {
    private Integer id;
    private String name_product;
    private int type_product;
    private int price_product;
    private int quantity_product;
    private String describe_product;
    private String supplier_product;
    private String list_image;
    private String detail_product;

    public ProductDTO(Integer id, String name_product, int type_product, int price_product, int quantity_product, String describe_product, String supplier_product, String list_image, String detail_product) {
        this.id = id;
        this.name_product = name_product;
        this.type_product = type_product;
        this.price_product = price_product;
        this.quantity_product = quantity_product;
        this.describe_product = describe_product;
        this.supplier_product = supplier_product;
        this.list_image = list_image;
        this.detail_product = detail_product;
    }

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

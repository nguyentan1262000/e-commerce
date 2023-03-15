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
}

package com.demo.ecommerce.DTO;

public class DetailProduct {
    private int size;
    private int quantity;

    public DetailProduct(int size, int quantity) {
        this.size = size;
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

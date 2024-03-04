package com.teachmeskills.lesson16.hw.model.product;

public class Product {

    private double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}

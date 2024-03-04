package com.teachmeskills.lesson16.hw.factory.order;

import com.teachmeskills.lesson16.hw.model.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderFactory {

    public static List<Product> generateFirstOrder() {
        Product product1 = new Product(120.65, "Shoes");
        Product product2 = new Product(75.47, "Bag");
        return new ArrayList<>(Arrays.asList(product1, product2));
    }

    public static List<Product> generateSecondOrder() {
        Product product1 = new Product(250.72, "Phone");
        Product product2 = new Product(99.78, "Pillow");
        Product product3 = new Product(750.47, "Watch");
        return new ArrayList<>(Arrays.asList(product1, product2, product3));
    }

    public static List<Product> generateThirdOrder() {
        Product product1 = new Product(45.89, "Kettle");
        Product product2 = new Product(95.75, "Vacuum cleaner");
        Product product3 = new Product(2300.78, "TV");
        Product product4 = new Product(1490.75, "Dish washer");
        return new ArrayList<>(Arrays.asList(product1, product2, product3, product4));
    }

}

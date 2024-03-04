package com.teachmeskills.lesson16.hw.model.client;
import com.teachmeskills.lesson16.hw.model.product.Product;

import java.util.List;

public class Client {

    private String passportNumber;
    private String name;
    private int age;
    private String registrationDate;
    private List<Product> orderList;

    public Client(String passportNumber, String name, int age, String registrationDate, List<Product> orderList) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
        this.orderList = orderList;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", registrationDate='" + registrationDate + '\'' +
                ", orderList=" + orderList +
                '}';
    }

}

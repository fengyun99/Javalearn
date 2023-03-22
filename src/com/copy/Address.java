package com.copy;

public class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // 深度拷贝构造函数
    public Address(Address address) {
        this.city = address.city;
        this.street = address.street;
    }
    // getter 和 setter 方法

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

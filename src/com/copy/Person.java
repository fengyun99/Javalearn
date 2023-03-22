package com.copy;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 深度拷贝构造函数
    public Person(Person person) {
        this.name = person.name;
        this.address = new Address(person.address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    //浅拷贝
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}



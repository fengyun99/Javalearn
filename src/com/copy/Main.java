package com.copy;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Shanghai", "Nanjing Road");
        Person person1 = new Person("Tom", address);

        // 深度拷贝 person1，创建一个新的 person2 对象
        Person person2 = new Person(person1);

        // 修改 person1 的地址信息
        person1.getAddress().setCity("Beijing");

        // 打印 person1 和 person2 的地址
        System.out.println(person1.getAddress().getCity());
        System.out.println(person2.getAddress().getCity());

        person1.setName("Koni");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
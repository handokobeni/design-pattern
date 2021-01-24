package com.learn.designpattern.builder;

public class BuilderApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer("1", "Beni", "Handoko", "beni@gmail.com", "94803");
        System.out.println(customer1.getFirstname());

        Customer customer2 = new CustomerBuilder()
                .setFirstname("Beni")
                .setEmail("handoko@email.com")
                .build();

        Customer customer3 = new CustomerBuilder()
                .setFirstname("Beni")
                .setPhone("4124325")
                .build();

        System.out.println(customer2.getEmail());
        System.out.println(customer3.getPhone());
    }

}

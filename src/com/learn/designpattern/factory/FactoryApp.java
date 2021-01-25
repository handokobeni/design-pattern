package com.learn.designpattern.factory;

public class FactoryApp {

    public static void main(String[] args) {

        // Employee manager1 = new Employee("Beni", "Manager", 12000000);
        // Employee manager2 = new Employee("Handoko", "Manager", 12000000);

        Employee manager1 = EmployeeFactory.createManager("Beni");
        System.out.println(manager1.getName() + " adalah " + manager1.getTitle() + " dengan gaji Rp. " + manager1.getSalary());

        Employee staff1 = EmployeeFactory.createStaff("Deni");
        System.out.println(staff1.getName() + " adalah " + staff1.getTitle() + " dengan gaji Rp. " + staff1.getSalary());

        // Tiger tiger = new Tiger();
        Animal tiger = AnimalFactory.create("tiger");
        Animal cat = AnimalFactory.create("cat");

        System.out.println(cat.speak());
        System.out.println(tiger.speak());
    }
}

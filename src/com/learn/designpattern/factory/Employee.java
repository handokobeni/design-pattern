package com.learn.designpattern.factory;

public class Employee {

    private String name;

    private String title;

    private int salary;

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }
}

package com.company.office.model;

public abstract class Employee {
    protected String id;
    protected String name;
    protected double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonusPercentage() {
        return 10.0;
    }

    public void printBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
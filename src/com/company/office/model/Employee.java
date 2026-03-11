package com.company.office.model;

import com.company.office.contract.MultiPurposeReport;
import com.company.office.contract.WorkerOperations;

public abstract class Employee implements WorkerOperations, MultiPurposeReport {
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

    public void approveBudget(double amount) {
        System.out.println(name + " approved budget: " + amount);
    }

    public void accessServerRoom() {
        System.out.println(name + " accessed the server room.");
    }

    public void workNightShift() {
        System.out.println(name + " is working night shift.");
    }

    public void managePayroll() {
        System.out.println(name + " managed payroll.");
    }

    public double getBonusPercentage() {
        return 10.0;
    }

    public void printBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
package com.company.office.service;

import com.company.office.model.Employee;

public class EmployeeService {

    public void processEmployee(Employee employee) {
        employee.printBasicInfo();

        try {
            employee.approveBudget(500000);
        } catch (Exception e) {
            System.out.println("approveBudget error: " + e.getMessage());
        }

        try {
            employee.accessServerRoom();
        } catch (Exception e) {
            System.out.println("accessServerRoom error: " + e.getMessage());
        }

        try {
            employee.workNightShift();
        } catch (Exception e) {
            System.out.println("workNightShift error: " + e.getMessage());
        }

        try {
            employee.managePayroll();
        } catch (Exception e) {
            System.out.println("managePayroll error: " + e.getMessage());
        }

        System.out.println("Bonus percentage: " + employee.getBonusPercentage());

        try {
            employee.codeFeature();
        } catch (Exception e) {
            System.out.println("codeFeature error: " + e.getMessage());
        }

        try {
            employee.repairEquipment();
        } catch (Exception e) {
            System.out.println("repairEquipment error: " + e.getMessage());
        }

        try {
            employee.guardEntrance();
        } catch (Exception e) {
            System.out.println("guardEntrance error: " + e.getMessage());
        }

        try {
            employee.preparePresentation();
        } catch (Exception e) {
            System.out.println("preparePresentation error: " + e.getMessage());
        }

        try {
            employee.cleanOffice();
        } catch (Exception e) {
            System.out.println("cleanOffice error: " + e.getMessage());
        }

        System.out.println("-----------------------------------");
    }
}
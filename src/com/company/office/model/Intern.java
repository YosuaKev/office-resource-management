package com.company.office.model;

public class Intern extends Employee {

    public Intern(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void approveBudget(double amount) {
        throw new UnsupportedOperationException("Intern cannot approve budget.");
    }

    @Override
    public void accessServerRoom() {
        throw new UnsupportedOperationException("Intern cannot access server room.");
    }

    @Override
    public void workNightShift() {
        throw new UnsupportedOperationException("Intern cannot work night shift.");
    }

    @Override
    public void managePayroll() {
        throw new UnsupportedOperationException("Intern cannot manage payroll.");
    }

    @Override
    public double getBonusPercentage() {
        return -5.0;
    }

    @Override
    public void codeFeature() {
        System.out.println(name + " coded small bug fixes.");
    }

    @Override
    public void repairEquipment() {
        throw new UnsupportedOperationException("Intern cannot repair equipment.");
    }

    @Override
    public void guardEntrance() {
        throw new UnsupportedOperationException("Intern cannot guard entrance.");
    }

    @Override
    public void preparePresentation() {
        System.out.println(name + " prepared slides for mentor.");
    }

    @Override
    public void cleanOffice() {
        System.out.println(name + " cleaned training room.");
    }

    @Override
    public void generateDailyReport() {
        System.out.println(name + " generated internship daily log.");
    }

    @Override
    public void generateMonthlyReport() {
        throw new UnsupportedOperationException("Intern cannot generate monthly report.");
    }

    @Override
    public void generateAuditReport() {
        throw new UnsupportedOperationException("Intern cannot generate audit report.");
    }

    @Override
    public void exportPdf() {
        System.out.println(name + " exported PDF log.");
    }

    @Override
    public void exportCsv() {
        throw new UnsupportedOperationException("Intern cannot export CSV.");
    }

    @Override
    public void emailReport() {
        throw new UnsupportedOperationException("Intern cannot email report.");
    }
}
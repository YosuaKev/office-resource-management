package com.company.office.model;

public class Technician extends Employee {

    public Technician(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void approveBudget(double amount) {
        throw new UnsupportedOperationException("Technician cannot approve budget.");
    }

    @Override
    public void codeFeature() {
        System.out.println(name + " coded internal support utility.");
    }

    @Override
    public void repairEquipment() {
        System.out.println(name + " repaired computers and printers.");
    }

    @Override
    public void guardEntrance() {
        throw new UnsupportedOperationException("Technician cannot guard entrance.");
    }

    @Override
    public void preparePresentation() {
        System.out.println(name + " prepared technical presentation.");
    }

    @Override
    public void cleanOffice() {
        System.out.println(name + " cleaned workstation area.");
    }

    @Override
    public void managePayroll() {
        throw new UnsupportedOperationException("Technician cannot manage payroll.");
    }

    @Override
    public void generateDailyReport() {
        System.out.println(name + " generated technical daily report.");
    }

    @Override
    public void generateMonthlyReport() {
        System.out.println(name + " generated technical monthly report.");
    }

    @Override
    public void generateAuditReport() {
        throw new UnsupportedOperationException("Technician cannot generate audit report.");
    }

    @Override
    public void exportPdf() {
        System.out.println(name + " exported PDF report.");
    }

    @Override
    public void exportCsv() {
        System.out.println(name + " exported CSV report.");
    }

    @Override
    public void emailReport() {
        throw new UnsupportedOperationException("Technician cannot email report.");
    }
}
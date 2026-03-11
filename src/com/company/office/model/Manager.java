package com.company.office.model;

public class Manager extends Employee {

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void codeFeature() {
        System.out.println(name + " codes a strategic dashboard feature.");
    }

    @Override
    public void repairEquipment() {
        System.out.println(name + " repaired office equipment.");
    }

    @Override
    public void guardEntrance() {
        System.out.println(name + " guarded the entrance.");
    }

    @Override
    public void preparePresentation() {
        System.out.println(name + " prepared executive presentation.");
    }

    @Override
    public void cleanOffice() {
        System.out.println(name + " cleaned the office.");
    }

    @Override
    public void managePayroll() {
        System.out.println(name + " approved and managed payroll.");
    }

    @Override
    public void generateDailyReport() {
        System.out.println(name + " generated daily report.");
    }

    @Override
    public void generateMonthlyReport() {
        System.out.println(name + " generated monthly report.");
    }

    @Override
    public void generateAuditReport() {
        System.out.println(name + " generated audit report.");
    }

    @Override
    public void exportPdf() {
        System.out.println(name + " exported report to PDF.");
    }

    @Override
    public void exportCsv() {
        System.out.println(name + " exported report to CSV.");
    }

    @Override
    public void emailReport() {
        System.out.println(name + " emailed report.");
    }

    @Override
    public void workNightShift() {
        throw new UnsupportedOperationException("Manager does not work night shift.");
    }
}
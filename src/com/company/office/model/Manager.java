package com.company.office.model;

import com.company.office.contract.*;

public class Manager extends Employee implements
        BudgetApprover,
        ServerRoomAccess,
        PayrollManager,
        PresentationPreparer,
        DailyReportGenerator,
        MonthlyReportGenerator,
        AuditReportGenerator,
        PdfExportable,
        CsvExportable,
        EmailableReport {

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void approveBudget(double amount) {
        System.out.println(name + " approved budget: " + amount);
    }

    @Override
    public void accessServerRoom() {
        System.out.println(name + " accessed the server room.");
    }

    @Override
    public void managePayroll() {
        System.out.println(name + " managed payroll.");
    }

    @Override
    public void preparePresentation() {
        System.out.println(name + " prepared executive presentation.");
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
        System.out.println(name + " exported PDF.");
    }

    @Override
    public void exportCsv() {
        System.out.println(name + " exported CSV.");
    }

    @Override
    public void emailReport() {
        System.out.println(name + " emailed report.");
    }
}
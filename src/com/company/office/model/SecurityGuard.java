package com.company.office.model;

public class SecurityGuard extends Employee {

    public SecurityGuard(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void approveBudget(double amount) {
        throw new UnsupportedOperationException("Security guard cannot approve budget.");
    }

    @Override
    public void accessServerRoom() {
        throw new UnsupportedOperationException("Security guard cannot access server room.");
    }

    @Override
    public void codeFeature() {
        throw new UnsupportedOperationException("Security guard cannot code feature.");
    }

    @Override
    public void repairEquipment() {
        throw new UnsupportedOperationException("Security guard cannot repair equipment.");
    }

    @Override
    public void guardEntrance() {
        System.out.println(name + " guarded office entrance.");
    }

    @Override
    public void preparePresentation() {
        throw new UnsupportedOperationException("Security guard cannot prepare presentation.");
    }

    @Override
    public void cleanOffice() {
        System.out.println(name + " cleaned security post.");
    }

    @Override
    public void managePayroll() {
        throw new UnsupportedOperationException("Security guard cannot manage payroll.");
    }

    @Override
    public void generateDailyReport() {
        System.out.println(name + " generated security incident report.");
    }

    @Override
    public void generateMonthlyReport() {
        System.out.println(name + " generated monthly security summary.");
    }

    @Override
    public void generateAuditReport() {
        throw new UnsupportedOperationException("Security guard cannot generate audit report.");
    }

    @Override
    public void exportPdf() {
        System.out.println(name + " exported PDF security report.");
    }

    @Override
    public void exportCsv() {
        throw new UnsupportedOperationException("Security guard does not use CSV export.");
    }

    @Override
    public void emailReport() {
        throw new UnsupportedOperationException("Security guard cannot email report.");
    }
}
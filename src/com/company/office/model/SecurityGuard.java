package com.company.office.model;

import com.company.office.contract.*;

public class SecurityGuard extends Employee implements
        NightShiftCapable,
        EntranceGuard,
        Cleaner,
        DailyReportGenerator,
        MonthlyReportGenerator,
        PdfExportable {

    public SecurityGuard(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void workNightShift() {
        System.out.println(name + " is working night shift.");
    }

    @Override
    public void guardEntrance() {
        System.out.println(name + " guarded office entrance.");
    }

    @Override
    public void cleanOffice() {
        System.out.println(name + " cleaned security post.");
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
    public void exportPdf() {
        System.out.println(name + " exported PDF security report.");
    }
}
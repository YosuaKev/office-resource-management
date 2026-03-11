package com.company.office.model;

import com.company.office.contract.*;

public class Intern extends Employee implements
        Coder,
        PresentationPreparer,
        Cleaner,
        DailyReportGenerator,
        PdfExportable {

    public Intern(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double getBonusPercentage() {
        return 2.0;
    }

    @Override
    public void codeFeature() {
        System.out.println(name + " coded small bug fixes.");
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
    public void exportPdf() {
        System.out.println(name + " exported PDF log.");
    }
}
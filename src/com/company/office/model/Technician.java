package com.company.office.model;

import com.company.office.contract.*;

public class Technician extends Employee implements
        ServerRoomAccess,
        NightShiftCapable,
        Coder,
        EquipmentRepairer,
        PresentationPreparer,
        DailyReportGenerator,
        MonthlyReportGenerator,
        PdfExportable,
        CsvExportable {

    public Technician(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void accessServerRoom() {
        System.out.println(name + " accessed the server room for maintenance.");
    }

    @Override
    public void workNightShift() {
        System.out.println(name + " is working night shift.");
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
    public void preparePresentation() {
        System.out.println(name + " prepared technical presentation.");
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
    public void exportPdf() {
        System.out.println(name + " exported PDF report.");
    }

    @Override
    public void exportCsv() {
        System.out.println(name + " exported CSV report.");
    }
}
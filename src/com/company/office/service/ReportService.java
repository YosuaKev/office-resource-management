package com.company.office.service;

import com.company.office.contract.*;

public class ReportService {

    public void createReport(Object obj) {
        if (obj instanceof DailyReportGenerator) {
            ((DailyReportGenerator) obj).generateDailyReport();
        }

        if (obj instanceof MonthlyReportGenerator) {
            ((MonthlyReportGenerator) obj).generateMonthlyReport();
        }

        if (obj instanceof AuditReportGenerator) {
            ((AuditReportGenerator) obj).generateAuditReport();
        }

        if (obj instanceof PdfExportable) {
            ((PdfExportable) obj).exportPdf();
        }

        if (obj instanceof CsvExportable) {
            ((CsvExportable) obj).exportCsv();
        }

        if (obj instanceof EmailableReport) {
            ((EmailableReport) obj).emailReport();
        }

        System.out.println("===================================");
    }
}
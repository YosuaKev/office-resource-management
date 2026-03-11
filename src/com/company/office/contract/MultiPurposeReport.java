package com.company.office.contract;

public interface MultiPurposeReport {
    void generateDailyReport();
    void generateMonthlyReport();
    void generateAuditReport();
    void exportPdf();
    void exportCsv();
    void emailReport();
}
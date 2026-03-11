package com.company.office.service;

import com.company.office.contract.MultiPurposeReport;

public class ReportService {

    public void createFullReport(MultiPurposeReport reportObject) {
        try {
            reportObject.generateDailyReport();
        } catch (Exception e) {
            System.out.println("generateDailyReport error: " + e.getMessage());
        }

        try {
            reportObject.generateMonthlyReport();
        } catch (Exception e) {
            System.out.println("generateMonthlyReport error: " + e.getMessage());
        }

        try {
            reportObject.generateAuditReport();
        } catch (Exception e) {
            System.out.println("generateAuditReport error: " + e.getMessage());
        }

        try {
            reportObject.exportPdf();
        } catch (Exception e) {
            System.out.println("exportPdf error: " + e.getMessage());
        }

        try {
            reportObject.exportCsv();
        } catch (Exception e) {
            System.out.println("exportCsv error: " + e.getMessage());
        }

        try {
            reportObject.emailReport();
        } catch (Exception e) {
            System.out.println("emailReport error: " + e.getMessage());
        }

        System.out.println("===================================");
    }
}
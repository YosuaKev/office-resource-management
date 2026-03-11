package com.company.office;

import com.company.office.model.*;
import com.company.office.service.EmployeeService;
import com.company.office.service.ReportService;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("M001", "Rina", 12000000);
        Employee technician = new Technician("T001", "Budi", 6500000);
        Employee security = new SecurityGuard("S001", "Andi", 5000000);
        Employee intern = new Intern("I001", "Salsa", 1500000);

        EmployeeService employeeService = new EmployeeService();
        ReportService reportService = new ReportService();

        employeeService.processEmployee(manager);
        employeeService.processEmployee(technician);
        employeeService.processEmployee(security);
        employeeService.processEmployee(intern);

        reportService.createReport(manager);
        reportService.createReport(technician);
        reportService.createReport(security);
        reportService.createReport(intern);

        MeetingRoom room = new MeetingRoom("MR-01", 10, true);
        Reservation reservation = new Reservation("R001", manager, room, "2026-03-11");
        reservation.printReservation();
    }
}
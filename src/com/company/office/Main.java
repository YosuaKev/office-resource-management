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

        reportService.createFullReport((Manager) manager);
        reportService.createFullReport((Technician) technician);
        reportService.createFullReport((SecurityGuard) security);
        reportService.createFullReport((Intern) intern);
    }
}
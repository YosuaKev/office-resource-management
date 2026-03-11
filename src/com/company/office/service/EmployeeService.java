package com.company.office.service;

import com.company.office.contract.*;
import com.company.office.model.Employee;

public class EmployeeService {

    public void processEmployee(Employee employee) {
        employee.printBasicInfo();
        System.out.println("Bonus percentage: " + employee.getBonusPercentage());

        if (employee instanceof BudgetApprover) {
            ((BudgetApprover) employee).approveBudget(500000);
        }

        if (employee instanceof ServerRoomAccess) {
            ((ServerRoomAccess) employee).accessServerRoom();
        }

        if (employee instanceof NightShiftCapable) {
            ((NightShiftCapable) employee).workNightShift();
        }

        if (employee instanceof PayrollManager) {
            ((PayrollManager) employee).managePayroll();
        }

        if (employee instanceof Coder) {
            ((Coder) employee).codeFeature();
        }

        if (employee instanceof EquipmentRepairer) {
            ((EquipmentRepairer) employee).repairEquipment();
        }

        if (employee instanceof EntranceGuard) {
            ((EntranceGuard) employee).guardEntrance();
        }

        if (employee instanceof PresentationPreparer) {
            ((PresentationPreparer) employee).preparePresentation();
        }

        if (employee instanceof Cleaner) {
            ((Cleaner) employee).cleanOffice();
        }

        System.out.println("-----------------------------------");
    }
}
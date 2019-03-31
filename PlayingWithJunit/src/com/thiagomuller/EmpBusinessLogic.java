package com.thiagomuller;

public class EmpBusinessLogic {

    public double calculateYearlySalary(EmployeeDetails employeeDetails){
        return employeeDetails.getMonthlySalary() * 12;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;
        }else{
            appraisal = 1000;
        }

        return appraisal;
    }
}

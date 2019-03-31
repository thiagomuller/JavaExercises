package com.thiagomuller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {

    @Test
    public void testCalculateAppriasal(){
        EmployeeDetails employeeDetails = new EmployeeDetails("Rajeev", 8000, 25);
        EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(500 , appraisal , 0.0);
    }

    @Test
    public void testCalculateYearlySalary(){
        EmployeeDetails employeeDetails = new EmployeeDetails("Rajeev", 8000, 25);
        EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
        double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
        assertEquals(96000, salary, 0.0);
    }

}

package com.pattern.structural.adapter;

public class PlacementService {
    EmployeeService employeeService = new EmployeeService();
    public void process(Student student){
        employeeService.saveEmployee(EmployeeAdapter.getEmployee(student));
    }
}

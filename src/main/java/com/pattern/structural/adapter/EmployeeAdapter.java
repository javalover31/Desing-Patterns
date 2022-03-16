package com.pattern.structural.adapter;

public class EmployeeAdapter {
    public static Employee getEmployee(Student student){
        return new Employee(student.rollNumber, student.name, student.fatherName);
    }
}

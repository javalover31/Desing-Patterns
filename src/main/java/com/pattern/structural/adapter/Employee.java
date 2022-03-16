package com.pattern.structural.adapter;

public class Employee {
    int employeeId;
    String name;
    String fatherName;

    public Employee(int employeeId, String name, String fatherName) {
        this.employeeId = employeeId;
        this.name = name;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

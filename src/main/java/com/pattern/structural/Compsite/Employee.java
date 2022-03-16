package com.pattern.structural.Compsite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int empId;
    String name;
    String dept;

    List<Employee> employees = new ArrayList<>();
    public Employee(int empId, String name, String dept) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

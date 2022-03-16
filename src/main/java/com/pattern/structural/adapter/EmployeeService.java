package com.pattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    static List<Employee> list = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        list.add(employee);
    }
}

package com.pattern.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(10,"ankit","indore");
        Employee employee1 = (Employee) employee.getClone();

        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
    }
}

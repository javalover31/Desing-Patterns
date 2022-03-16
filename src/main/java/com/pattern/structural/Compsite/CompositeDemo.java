package com.pattern.structural.Compsite;

public class CompositeDemo {
    public static void main(String[] args) {

        Employee ceo = new Employee(1,"ankit", "CEO");
        Employee headSales = new Employee(2,"ashu", "Head Sales");
        Employee headMarketing = new Employee(3,"amit", "Head Marketing");
        ceo.addEmployee(headSales);
        ceo.addEmployee(headMarketing);

        Employee salesExecutive1 = new Employee(21,"ashu", "Sales executive");
        Employee salesExecutive2 = new Employee(22,"ashu", "Sales executive");
        headSales.addEmployee(salesExecutive1);
        headSales.addEmployee(salesExecutive2);

        Employee marketing1 = new Employee(21,"ashu", "Marketing");
        Employee marketing2 = new Employee(22,"ashu", "Marketing");
        headMarketing.addEmployee(marketing1);
        headMarketing.addEmployee(marketing2);

        System.out.println(ceo);

        for (Employee headEmp: ceo.getSubordinates()
             ) {
            System.out.println(headEmp);
            System.out.println("-------------");
            for (Employee employee : headEmp.getSubordinates()) {
                System.out.println(employee);
            }
            System.out.println("--------------");
        }

    }
}

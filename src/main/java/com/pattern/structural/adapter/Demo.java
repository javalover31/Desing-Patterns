package com.pattern.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        PlacementService placementService = new PlacementService();
        placementService.process(new Student(1245,"ankit","akhilesh"));
        placementService.process(new Student(4569,"kush","akhilesh"));
        placementService.process(new Student(7893,"himanshu","rajendra"));

        System.out.println(new EmployeeService().list);
    }
}

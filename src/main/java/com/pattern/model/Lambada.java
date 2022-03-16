package com.pattern.model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambada {
    public static void main(String[] args) {
       /* Lam l = b -> {
            System.out.println("klnkl");
        };
        l.m1(20);*/

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10));
        list.add(new Employee(30));
        list.add(new Employee(50));
        list.add(new Employee(20));
        list.add(new Employee(20));

        List<Employee> list3 = new ArrayList<>();
        list3.add(new Employee(10,"sanju"));
        list3.add(new Employee(30,"raju"));
        list3.add(new Employee(50,"ankit"));
        list3.add(new Employee(20,"kakku"));
        list3.add(new Employee(30,"kakku1"));
//        sum()
        int s = list.stream().filter(a -> a.getAge() <=20).mapToInt(k -> k.getAge()).sum();
        System.out.println(s);
//      count()
        long i = list.stream().filter(a -> a.getAge()>20).count();
        System.out.println(i);
//      sorted with object
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(8);
        list2.add(5);
        list2.add(3);
        list2.add(1);

        ListIterator lt= list2.listIterator();
        while (lt.hasNext()){
            Integer is =(Integer) lt.next();
            if (is.equals(1))
            lt.set(88);
        }
        System.out.println("lkiu"+list2);
        SortedSet<String> t = new TreeSet<>();
        t.add("q");
        t.add("a");
        t.add("A");
        System.out.println("treeste"+t);
        List<Integer> sortedList= list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
//      sorted with custom object
        List<Employee> sortedCustomList = list.stream().sorted((e1, e2) -> (e1.getAge()>e2.getAge())?1:((e1.getAge())< e2.getAge())?-1:0).collect(Collectors.toList());
        for (Employee e:sortedCustomList ) {
            System.out.println("----------------");
            System.out.print(e.getAge()+" ,");
        }
//      min()
        Employee k = list.stream().min((e1, e2) -> (e1.getAge()>e2.getAge())?1:((e1.getAge())< e2.getAge())?-1:0).get();
        System.out.println("\n"+k.getAge());
//      max()
        Employee e = list.stream().max((e1,e2) -> (e1.getAge()> e2.getAge())? 1:(e1.getAge()< e2.getAge())?-1:0).get();
        System.out.println(e.getAge());
//      toArray()
       Integer[] integer =  list2.stream().toArray(Integer[]::new);
        for (int j = 0; j < integer.length; j++) {
            System.out.print(integer[j]+" ,");
        }
//        anyMatch()
        boolean emp = list.stream().anyMatch(em-> em.getAge()>20);
        System.out.println();
        System.out.println(emp);
//        allMatch()
        boolean AmEmp = list.stream().allMatch(am -> am.getAge()==10);
        System.out.println(AmEmp);
//        noneMatch()
        boolean nMEmp= list.stream().noneMatch(nm -> nm.getAge()==40);
        System.out.println(nMEmp);
//        collect() with GroupBy()
        Map<Integer, List<Employee>> groupByAge = list3.stream().collect(Collectors.groupingBy(Employee::getAge));
        groupByAge.forEach((key, value) -> {
            System.out.println(key+" - "+value.get(0).getName());
        });
//        disctinct()
        List<String> el = list3.stream().map(Employee::getName).distinct().collect(Collectors.toList());
        for (String name:el) {
            System.out.println(name);
        }
//        1. map()
        List<Integer> mL = list.stream().map(Employee::getAge).filter(f-> f>10).collect(Collectors.toList());
        System.out.println(mL);
//          2. map()
        List map = list3.stream().map(em -> em.getName()).collect(Collectors.toList());
        System.out.println(map);

//        flatMap()
        List<String> fList = new ArrayList<>();
        fList.add("ankit5");
        fList.add("ankit3");
        fList.add("ankit1");
        fList.add("ankit4");
        List<String> flist1 = new ArrayList<>();
        flist1.add("Kakku1");
        flist1.add("Kakku2");
        flist1.add("Kakku3");
        flist1.add("Kakku4");
        flist1.add("Kakku5");
        List<String> kk = Stream.of(fList,flist1).flatMap(ee-> ee.stream()).collect(Collectors.toList());
        System.out.println(kk);
        List<Employee> eF = Stream.of(list,list3).flatMap(eee -> eee.stream()).collect(Collectors.toList());
        System.out.println(eF);

//        limit()
        List<Employee> ll = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(ll);
//        skip()
        List<Employee> ol = list.stream().skip(2).collect(Collectors.toList());
        System.out.println(ol);

    }
}

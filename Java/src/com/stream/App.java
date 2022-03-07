package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Sonu", 45000.0));
        empList.add(new Employee(102, "Monu", 40000.0));
        empList.add(new Employee(103, "Tonu", 50000.0));
        empList.add(new Employee(104, "Ponu", 55000.0));
        empList.add(new Employee(105, "Gonu", 35000.0));
        System.out.println();

        System.out.println(empList);

        System.out.println();

        System.out.println("iterate with iterator");

        System.out.println();

        Iterator<Employee> empIt = empList.iterator();
        while (empIt.hasNext()) {
            System.out.println(empIt.next().toString());
        }

        System.out.println();

        System.out.println("iterate with forEach() with lambda"); // () -> {}

        System.out.println();
        empList.forEach((emp) -> {
            System.out.println(emp.toString());
        });

        // Java Stream API

        // Collection to stream
        System.out.println();
        System.out.println();

        System.out.println("Filtering Based on High Salary using Stream API");

        System.out.println();
        Stream<Employee> empStream = empList.stream();

        // Stream To Collection

        //List<Employee> empList1 = empStream.collect(Collectors.toList());

        Stream<Employee> empWithHighSal = empStream.filter(emp -> emp.getSalary()>40000);

        empWithHighSal.forEach((emp1) -> {
            System.out.println(emp1.toString());
        });

        System.out.println("ShortCut");
        // List (Collection) to Stream,Stream Operations,Stream to List
        List <Employee> emp2 = empList.stream().filter(emp -> emp.getSalary()>40000).collect(Collectors.toList());
        System.out.println(emp2);
        System.out.println();
        System.out.println("Using Limit");
        Stream<Employee> firstThreeEmp = empList.stream().limit(3);
        firstThreeEmp.forEach(emp -> System.out.println(emp.toString()));

        System.out.println();

        System.out.println("Using Skip");
        Stream<Employee> skipFirstTwoEmp = empList.stream().skip(4);
        skipFirstTwoEmp.forEach(emp -> System.out.println(emp.toString()));

        System.out.println();

        System.out.println("Using map() to increase salary");
        List<Double> salaryHike = empList.stream().map(emp3 -> emp3.getSalary()+100).collect((Collectors.toList()));
        salaryHike.forEach(emp -> System.out.println(emp.toString()));

        System.out.println();
        System.out.println("Using map() to change case");
        List<String> nameInUpperCase = empList.stream().map(emp -> emp.geteName().toUpperCase()).collect((Collectors.toList()));
        nameInUpperCase.forEach(emp -> System.out.println(emp.toString()));

        System.out.println();

        System.out.println("Using IntStream to work with int values");

        IntStream myInts = IntStream.of(10, 20, 30);
        myInts.forEach(System.out::println);

        IntStream myInts2 = IntStream.rangeClosed(6, 10);
        myInts2.forEach(System.out::println);

    }


}


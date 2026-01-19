package com.sham.stream;

import java.util.*;

record Employee(Integer id, String name, String department, Integer salary, Integer age) {}

public class MapToXXXEmployeeProject {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee(1, "Sham", "IT", 55000, 25),
            new Employee(2, "Riya", "HR", 48000, 28),
            new Employee(3, "Amit", "IT", 62000, 30),
            new Employee(4, "Neha", "Finance", 70000, 35),
            new Employee(5, "Puneet", "IT", 53000, 24),
            new Employee(6, "Rohan", "HR", 50000, 27)
        );
        
//        Map<String, Long> collect = employees.stream()
//        .collect(Collectors.groupingBy(e->e.department(),Collectors.counting()));
//        
//        System.out.println(collect);
        
        employees.stream()
//        .sorted(Comparator.comparingInt(Employee::age).reversed())
        .sorted((e1,e2)->e1.age().compareTo(e2.age()))
        .forEach(System.out::println);

        // 1. Print all employees
//        System.out.println("All Employees:");
//        employees.forEach(System.out::println);

//        // 2. Filter IT Department Employees
//        System.out.println("\nIT Employees:");
//        employees.stream()
//                 .filter(emp -> emp.department().equals("IT"))
//                 .forEach(System.out::println);
//
//        // 3. Average salary of all employees
//        double avgSalary = employees.stream()
//                                    .mapToDouble(Employee::salary)
//                                    .average()
//                                    .orElse(0);
//        System.out.println("\nAverage Salary: " + avgSalary);
//
//        // 4. Highest Salary Employee
//        Employee maxEmp = employees.stream()
//                                   .max(Comparator.comparingDouble(Employee::salary))
//                                   .orElse(null);
//        System.out.println("\nHighest Paid Employee:");
//        System.out.println(maxEmp);
//
//        // 5. Sort employees by age (ascending)
//        System.out.println("\nEmployees sorted by age:");
//        employees.stream()
//                 .sorted(Comparator.comparingInt(Employee::age))
//                 .forEach(System.out::println);
//
//        // 6. Count employees in HR department
//        long hrCount = employees.stream()
//                                .filter(emp -> emp.department().equals("HR"))
//                                .count();
//        System.out.println("\nHR Employee Count: " + hrCount);
//
//        // 7. Total salary (sum)
//        double totalSalary = employees.stream()
//                                      .mapToDouble(Employee::salary)
//                                      .sum();
//        System.out.println("\nTotal Salary of all employees: " + totalSalary);
//
//        // 8. List of unique departments
//        System.out.println("\nDepartments:");
//        employees.stream()
//                 .map(Employee::department)
//                 .distinct()
//                 .forEach(System.out::println);
//
//        // 9. Employees older than 28
//        System.out.println("\nEmployees older than 28:");
//        employees.stream()
//                 .filter(emp -> emp.age() > 28)
//                 .forEach(System.out::println);
//
//        // 10. Convert employee names to uppercase (map)
//        System.out.println("\nEmployee Names in Uppercase:");
//        employees.stream()
//                 .map(emp -> emp.name().toUpperCase())
//                 .forEach(System.out::println);
    }
}


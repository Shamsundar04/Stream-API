package com.sham.terminalmethod;

import java.util.ArrayList;
import java.util.Scanner;


record Student(String course, Integer id, String name){}
record Employee(String name, String department, Integer salary) {}

public class GroupingByMethod {
	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		ArrayList<String> names=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			names.add(scn.next());
		}
		 
		 names.stream().filter(name->name.startsWith("s")).limit(2)
		 .forEach(n->System.out.println(n));
		 
		 scn.close();
		 
		
//		List<String> listOfCity = Arrays.asList("Delhi", "Indore", "Kolkata", "Pune", "Hyderabad", "Mumbai", "Chennai", "Ampt");
//	
//		Map<Integer, List<String>> collect = listOfCity.
//				stream().collect(Collectors.groupingBy(String::length));
//	
//		System.out.println(collect);
		
//		Student s1 = new Student("Java", 101,"Scott");
//		Student s2 = new Student("Java", 102, "Smith");
//		Student s3 = new Student("Java", 103,"Samrat");
//		Student s4 = new Student("HTML", 104, "Raj");
//		Student s5 = new Student("HTML", 105, "Rahul");
//		Student s6 = new Student("REACT", 106, "Alen");
//		Student s7 = new Student("REACT", 107, "John");
//		
//		Stream<Student> of = Stream.of(s1,s2,s3,s4,s5,s6,s7);
//		Map<String, List<Student>> collect = of.collect(Collectors.groupingBy(Student::course));
//		
//		collect.forEach((k, v)->System.out.println(k+"  "+v));
		
		
//		 List<Employee> employees = Arrays.asList(
//		            new Employee("Sham", "IT", 80000),
//		            new Employee("John", "IT", 70000),
//		            new Employee("Alice", "HR", 70000),
//		            new Employee("Bob", "Finance", 90000)
//		        );
//		 
////		 1 & 2: Group by department → List of names
//		 
//		 Map<String, List<String>> collect = employees.stream()
//				 .collect(Collectors.groupingBy(Employee::department, 
//						 Collectors.mapping(Employee::name, Collectors.toList())));
//		 System.out.println(collect);
//		 
////		 3: Group by department → Total salary
//		 
//		 Map<String, Integer> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::department, 
//				 Collectors.summingInt(Employee::salary)));
//		 
//		 System.out.println(collect2);
//		
////		 4: Department → Highest Paid Employee
//		 
//		 
//		 Map<String, Optional<Employee>> collect3 = employees.stream()
//				 .collect(Collectors.groupingBy(Employee::department,
//				 Collectors.maxBy(Comparator.comparing(Employee::salary))
//				 ));
//		 
//		 collect3.forEach((k,v)->System.out.println(k+"  "+v.get().name()));
//		 
////		 5: Department → Average Salary
//		 
//		 Map<String, Double> collect4 = employees.stream().collect(Collectors.groupingBy(Employee::department,
//				 Collectors.averagingInt(Employee::salary)));
//		 
//		 System.out.println(collect4);
		 
		 
	 
		 
		 
		 
	}
}

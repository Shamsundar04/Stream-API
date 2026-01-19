package com.sham.stream;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//record Employee(Integer id, String name, Double salary) {
//	public Employee(Integer id, String name, Double salary) {
//	    this.id = id;
//	    this.name = name;
//	    this.salary = salary;
//	}
//}

public class Program {
	public static void main(String[] args) {
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		list.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
	
//		List<String> names = Arrays.asList("sham","sujit","vijay","ganesh","ajay","vicky","vishwa");
//		List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(result);
		
//		List<String> names = Arrays.asList("ankit", "sham", "amit", "ajay");
//		long count = names.stream().filter(n->n.startsWith("a")).count();
//		System.out.println(count);
		
//		List<Integer> nums = Arrays.asList(10, 20, 30);
//		Optional<Integer> first = nums.stream().findFirst();
//		System.out.println(first.get());
		
//		List<Integer> list = Arrays.asList(1,2,3,4,2,3,5);		
//		Set<Integer> set=new HashSet<>();		
//		list.stream().filter(n->!set.add(n)).forEach(System.out::println);
		
//		List<Employee> empList = Arrays.asList(
//		        new Employee(1,"Sham",30000d),
//		        new Employee(2,"Ankit",50000d),
//		        new Employee(3,"Teju",40000d)
//		);
		
//		Convert List<Employee> to List<String> names
		
//		List<String> names = empList.stream()
//				.map(Employee::name)
//				.collect(Collectors.toList());
//		System.out.println(names);
		
		
//		empList.stream()
//		.sorted((e1,e2)->e1.salary()
//		.compareTo(e2.salary()))
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
//		double maxSalary = empList.stream()
//		        .map(Employee::salary)
//				.reduce(0.0, (a, b) -> a > b ? a : b);
//		System.out.println(maxSalary);
		
		

//		List<Integer> list = Arrays.asList(10, 20, 150, 40);
//		boolean result = list.stream()
//		        .anyMatch(n -> n > 100);
//		System.out.println(result);

	
//		List<String> words = Arrays.asList("java", "spring", "java", "sql", "sql");
		
//		HashMap<String, Integer> count=new HashMap<>();
//		for (String word : words) {
//			count.put(word, count.getOrDefault(word, 0)+1);
//		}
//		count.forEach((k,v)->System.out.println(k+"  "+v));

//		Map<String, Long> countMap = words.stream()
//		        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//		System.out.println(countMap);
		
//		groupingBy(w -> w, ...) group elements by their own value
//		means "apple" one group "banana" one group "orange" one group
//		Collectors.counting() in the group how much words is there it count
		
		
//		13. Find longest string
//		List<String> list = Arrays.asList("Sham", "JavaDeveloper", "AI");
//		String longest = list.stream()
//		        .max(Comparator.comparing(String::length))
//		        .get();
//		System.out.println(longest);
		
		
		
//		List<String> tech = Arrays.asList("Java", "Spring", "SQL");
//		String joined = tech.stream()
//		        .collect(Collectors.joining(","));
//		System.out.println(joined);

		
		
		
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);

		Map<Boolean, List<Integer>> result = list.stream()
		        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println("Even: " + result.get(true));
		System.out.println("Odd: " + result.get(false));


	}
}











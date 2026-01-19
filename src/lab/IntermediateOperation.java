package lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Person(String name, Integer age) {}
record Emp(Integer id, String name, Double salary) {}

public class IntermediateOperation {
	public static void main(String[] args) {
		
//		Given a list of Person objects with name and age properties, 
//		write a program to sort the list of persons by age in ascending order using the Stream API.
		
		Person p1 = new Person("sham", 21);
		Person p2 = new Person("ganesh", 24);
		Person p3 = new Person("chandu", 23);
		Person p4 = new Person("ranjit", 24);
		Person p5 = new Person("shankar", 25);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		persons.stream().sorted((per1,per2)->per1.age().compareTo(per2.age()))
		.forEach(p->System.out.println(p));
		
		System.out.println("*************************");
//		
//		persons.stream().sorted(Comparator.comparing(Person::age)
//				.thenComparing(Comparator.comparing(Person::name)))
//		.forEach(p->System.out.println(p));
//		
//		Collections.sort(persons, Comparator.comparingInt(Person::age));
		
		
		
		
//		Write a program to convert all the strings in a list to uppercase 
//		and print the result using the Stream API.
		
//		List<String> names = Arrays.asList("ram", "sham", "rohit", "rushi", "suraj");
//		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
//		Given a list of Employee objects with id and salary properties,
//		write a program to sort the list of Employees by salary in descending order using the Stream API.
		
		Emp e1=new Emp(111,"sham", 34000d);
		Emp e2=new Emp(222,"vijay", 29000d);
		Emp e3=new Emp(333,"suraj", 25000d);
		Emp e4=new Emp(444,"raj", 24000d);
		Emp e5=new Emp(555,"rohit", 54000d);
				
		List<Emp> emps = Arrays.asList(e1,e2,e3,e4,e5);
		emps.stream().sorted(Comparator.comparing(Emp::salary).reversed())
		.forEach(System.out::println);
		
		System.out.println("***********************");
				
		
//		Write a program to convert all the strings in a list to 
//		lowercase and print the result using the Stream API.
		
//		 List<String> names = Arrays.asList("RAM", "SHAM", "ROHIT", "RUSHI", "SURAJ");
//	        names.stream()
//	             .map(String::toLowerCase)
//	             .forEach(System.out::println);
	        
		
		
//		Given a list of Employee objects with id and salary properties
//		write a program to filter the list of Employees by salary in who are having salary > 30000.
	    
//	    emps.stream().filter(e->e.salary()>30000).forEach(System.out::println);

		
//		Write a program to convert all the lower case strings in a list to 
//		first letter Uppercase and print the result using the Stream API.
		
		List<String> list = Arrays.asList("abcd" , "efgh" , "jklm" , "xyz");
		list.stream().map(n->n.substring(0, 1).toUpperCase() + n.substring(1))
		.forEach(System.out::println);
		
		
	}
}

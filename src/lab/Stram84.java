package lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


record Employee(String name, Integer age, Double salary, String gender) {
    
    // Custom constructor
    public Employee(String name, Integer age, Double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
}

class EmployeeAdder {
    public static List<Employee> addDetails() {
        return List.of(
            new Employee("Anna", 42, 50000.0, "Male"),
            new Employee("Sakshi", 27, 51000.0, "Female"),
            new Employee("Bob", 27, 52000.0, "Male"),
            new Employee("Nikita", 28, 53000.0, "Female"),
            new Employee("EmSmithployee", 29, 53000.0, "Male"),
            new Employee("Pooja", 30, 55000.0, "Female"),
            new Employee("Vijay", 31, 56000.0, "Male"),
            new Employee("Rutuja", 32, 57000.0, "Female"),
            new Employee("Sahil", 35, 58000.0, "Male"),
            new Employee("EmplSmithoyeeee", 35, 59000.0, "Male"),
            new Employee("Eve", 31, 60000.0, "Female"),         
            new Employee("Anna Smith", 32, 65000.0, "Female"),   
            new Employee("Bob", 35, 52000.0, "Male"),           
            new Employee("Eleanor", 33, 70000.0, "Female"), 
            new Employee("Alexandera", 34, 55000.0, "Female"),
            new Employee("Emilia", 30, 51000.0, "Female"),
            new Employee("Smithsonna", 29, 53000.0, "Male"),
            new Employee("Elizabeth", 28, 57000.0, "Female"),
            new Employee("Ava", 27, 50000.0, "Female"),      
            new Employee("Evangeline", 26, 64000.0, "Female")

        );
    }
}


public class Stram84 {
		
	public static void main(String[] args) {
		
//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		
		List<Employee> list = EmployeeAdder.addDetails();
		
//		list.stream().filter(emp->emp.gender().toLowerCase().equals("male")).forEach(System.out::println);
//		Map<Boolean, List<String>> collect = list.stream()
//				.collect(Collectors.partitioningBy(emp->emp.gender().toLowerCase().equals("male"),
//						Collectors.mapping(Employee::name, Collectors.toList())));
//		
//		collect.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
//		2. Filter Employees by Age:
//		 - Get a list of employees older than 30 years.
		
//		List<String> collect = list.stream().filter(emp->emp.age()>30)
//			.collect(Collectors.mapping(Employee::name, Collectors.toList()));
//		
//		collect.forEach(System.out::println);
		
		
//		3. Filter Employees by Salary:
//		 - Find employees with a salary greater than $50,000.

//		List<String> collect = list.stream().filter(emp->emp.salary()>50000)
//		.collect(Collectors.mapping(Employee::name, Collectors.toList()));
//		
//		collect.forEach(System.out::println);
		
		
//		4. Map Employee Names:
//		 - Create a list of employee names (Strings).
		
//		list.stream().map(emp->emp.name()).forEach(System.out::println);
		
		
//		5. Calculate Average Salary:
//		 - Calculate the average salary of all employees.
		
//		list.stream().mapToDouble(Employee::salary)
//		.average()
//		.ifPresent(System.out::println);
		
		
//		6. Find Maximum Salary:
//	     - Find the employee with the highest salary.
		
//		OptionalDouble max = list.stream().mapToDouble(e->e.salary()).max();
//		max.ifPresent(System.out::println);
		
//		7.Group Employees by Gender:
//	    - Group employees by gender and return
		
//		Map<String, List<String>> collect = list.stream()
//				.collect(Collectors.groupingBy(Employee::gender,Collectors.mapping(Employee::name, Collectors.toList())));
//		collect.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
//		8. Count Male Employees:
//		 - Count the number of male employees.
		
//		long count = list.stream().filter(emp->emp.gender().equals("Male"))
//			.count();
//		System.out.println(count);
		
		
//		9. Sum of All Salaries:
//		   - Calculate the total sum of salaries for all employees.
		
//		double sum = list.stream().mapToDouble(emp->emp.salary()).sum();
//		System.out.println(sum);
		
		
//		10. Sort Employees by Name:
//	    - Sort the employees by their names in alphabetical order.
		
//		list.stream().sorted(Comparator.comparing(Employee::name))
//			.forEach(System.out::println);
		
		
//		11. Sort Employees by Age:
//	    - Sort the employees by age in ascending order.
		
//		list.stream().sorted(Comparator.comparing(Employee::age))
//		.forEach(System.out::println);
		
		
//		12. Sort Employees by Salary:
//	    - Sort the employees by salary in descending order.
		
//		list.stream().sorted(Comparator.comparing(Employee::salary).reversed())
//		.forEach(System.out::println);
		
		
//		13. Find Oldest Employee:
//	    - Find the oldest employee.
		
//		Employee employee = list.stream().max((e1,e2)->Integer.compare(e1.age(),e2.age()))
//		.get();
//		System.out.println(employee);
		
//		System.out.println(list.stream().max((e1,e2)->Integer.compare(e1.age(), e2.age())));
		
		
//		14. Group Employees by Age:
//	    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//	    and return a map with age group as the key and a list of employees as the value.		
		
//		list.stream().collect(Collectors.groupingBy(
//				
//				(e)->{
//					int age=e.age();
//					if (age>=20&&age<=30) return "20-30";
//					else if (age>=30 && age<=40) return "30-40";
//					else return "40+";	
//					
//				},Collectors.mapping(Employee::name, Collectors.toList())))
//		.forEach((key, value) -> System.out.println(key + " - " + value));
		
		
//		15. Find Employees with a Specific Age:
//	    - Find all employees who are exactly 35 years old.
		
//		list.stream().filter(emp->emp.age()==35)
//			.forEach(System.out::println);
		
//		16. Calculate the Sum of Salaries by Gender:
//	    - Calculate the sum of salaries for each gender (i.e., male and female)
		
//		list.stream()
//		.collect(Collectors.groupingBy(Employee::gender ,
//				Collectors.summingDouble(Employee::salary)))
//		.forEach((key,value)->System.out.println(key +" - "+value));
		
		
		
//		Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(
//				
//				(emp)->{
//					String gen=emp.gender();
//					
//					if (gen.equals("Male"))
//						return "Male";
//					else if (gen.equals("Female"))
//						return "Female";
//					else return "Other";
//					
//				},Collectors.summingDouble(Employee::salary))
//				
//				);
//		collect.forEach((key, value) -> System.out.println(key + " - " + value));
		
		
//		17. Find Employees with Names Starting with "J":
//	    - Find all employees whose names start with the letter "E."	
		
//		list.stream().filter(emp->emp.name().startsWith("S"))
//		.forEach(System.out::println);
		
		
		
//		18. Calculate the Average Salary for Male and Female Employees:
//	    - Calculate the average salary separately for male
//	    and female employees and return a map with gender
//	    		as the key and the average salary as the value.		
		
//		Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Employee::gender,
//				Collectors.averagingDouble(Employee::salary)));
//
//		collect.forEach((k,v)->System.out.println(k+"  "+v));
		
		

//		19. Find the Top N Highest Paid Employees:
//		    - Find the top N employees with the highest salaries.
		
		
//		list.stream().sorted(Comparator.comparing(Employee::salary).reversed())
//		.limit(5).forEach(e->System.out.println(e.name()));
		
//		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//		Arrays.stream(numbers).filter(n->n>1&&IntStream.rangeClosed(2, (int)Math.sqrt(n))
//		.noneMatch(i->n%i==0)).forEach(System.out::println);
		
//		list.stream().sorted(Comparator.comparing(Employee::salary).reversed())
//		.limit(5).forEach(System.out::println);
		
		
//		20. Retrieve Distinct Age Values:
//	    - Get a list of distinct ages of all employees.	
//		list.stream().map(Employee::age).distinct().forEach(System.out::println);
		
		
//		21. Find the Three Lowest-Paid Employees:
//		   - Find and display the names of the three employees with the lowest salaries.

//		list.stream().sorted(Comparator.comparing(Employee::salary))
//		.limit(3)
//		.map(Employee::name)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
		
//		22. Sort Employees by Name Length:
//		   - Sort employees by the length of their names (shortest to longest).		
		
//		list.stream().sorted((e1,e2)->(e1.name().length()-(e2.name().length())))
//			.forEach(System.out::println);

//		list.stream().sorted(Comparator.comparingInt(e->e.name().length()))
//		.forEach(System.out::println);
//		
//		or
		
//		list.stream().sorted((e1,e2)->(e1.name().length()-(e2.name().length())))
//		.forEach(System.out::println);
		
		
//		23. Group Employees by Age Range:
//		   - Group employees into custom
//		   age ranges (e.g., 20-29, 30-39, etc.) and
//		   return a map with the age range as the key and a list of employees as the value.

//		list.stream().collect(Collectors.groupingBy(
//				
//				(a)->{
//					int age=a.age();
//					if (age>=20 && age<=29)
//						return "20-29";
//					else if (age>=30 && age<=39)
//						return "30-39";
//					else 
//						return "40+";
//				},Collectors.mapping(Employee::name, Collectors.toList())
//				
//				)).forEach((k,v)->System.out.println(k+"  "+v));
		
		
//		24. Find the Average Salary of Employees Aged 30 or Younger:
//		   - Calculate the average salary of employees aged 30 or younger.

		
//		list.stream().filter(emp->emp.age()<=30)
//			.mapToDouble(Employee::salary)
//				.average().ifPresent(System.out::println);
		
		
//		26. Find the Youngest Female Employee:
//		   - Find the youngest female employee.
		
//		list.stream().filter(emp->emp.gender().equals("Female"))
//		.collect(Collectors.minBy(Comparator.comparingInt(Employee::age)))
//		.ifPresent(System.out::print);
		
		
//		27. Retrieve the Names of Employees in Reverse Order:
//		   - Get a list of employee names in reverse order (from the last employee to the first).

		
		
		
//		List<Employee> collect = list.stream().collect(Collectors.toList());
//		collect.forEach(System.out::println);
//		Collections.reverse(collect);
//		System.out.println("After sorting");
//		collect.forEach(System.out::println);
		
		
//		28. Find the Highest Salary Among Female Employees:
//		   - Find the highest salary among female employees.
		
//		Optional<Employee> collect = list.stream().filter(emp->emp.gender().equals("Female"))
//		.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)));
//		System.out.println(collect);
		
		
//		29. Group Employees by Age and Gender:
//		   - Group employees by both age and gender and return a multi-level map.

		
//		Map<String, Map<Integer, List<Employee>>> collect = list.stream()
//				.collect(Collectors.groupingBy(Employee::gender
//				,Collectors.groupingBy(Employee::age, Collectors.toList())));
//		
//		
//		collect.forEach((k,v)->
//		{
//			v.forEach((key,value)->System.out.println(k+" "+v));
//			System.out.println(k+" "+v);
//			
//		});
		
		
//		30. Find the Sum of Salaries for Employees with Names Containing "Smith":
//		   - Calculate the sum of salaries for employees whose names contain the substring "Smith."
		
//		double sum = list.stream().filter(name -> name.name().contains("Smith"))
//				.mapToDouble(k -> k.salary()).sum();
//		System.out.println(sum);
				
		
//		31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
//		   - Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.

//		list.stream().filter(emp->(emp.age()>30&&emp.age()<40)&&(emp.salary()>50000&&emp.salary()<60000))
//			.forEach(System.out::println);
		
//		32. Calculate the Total Number of Employees:
//		   - Determine the total count of employees.
		
//		long count = list.stream().count();
//		System.out.println(count);
		
		
//		33. Find the Most Common Age Among Employees:
//		   - Determine the age that is most common among the employees.
		
		
//		Integer orElseThrow3 = list.stream()
//				.collect(Collectors.groupingBy(Employee::age,Collectors.counting())) // grouping ages and count
//				.entrySet() // converting to set
//				.stream()
//				.max(Map.Entry.comparingByValue()) // finding max value in map
//				.map(Map.Entry::getKey) // getting key of max value
//				.orElseThrow(); // getting the key
//				System.out.println(orElseThrow3);
		


//		35. Group Employees by Age and Count:
//		   - Group employees by age and count the number of employees in each age group.
		
		
//		list.stream().collect(Collectors.groupingBy(Employee::age,Collectors.counting()))
//		.forEach((key,value)->System.out.println(key+" - "+value));
		
		
//		36. Find the Employee with the Longest Name:
//		   - Find the employee with the longest name.
		
//		Optional<Employee> max = list.stream().max(Comparator.comparingInt(e->e.name().length()));
//		System.out.println(max);

//		37. Calculate the Sum of Salaries for Each Age:
//		   - Calculate the sum of salaries for each distinct age in a map.
		
//		list.stream().collect(Collectors.groupingBy(Employee::age, 
//				Collectors.summingDouble(Employee::salary)))
//			.forEach((k,v)->System.out.println(k+" "+v));
		
		
//		list.stream().collect(Collectors.groupingBy(Employee::age,
//				Collectors.summingDouble(Employee::salary)))
//		.forEach((key,value)->System.out.println(key+" - "+value));
		
//		Set<Integer> set=new HashSet<>();
//		set.clear();
//		
//		list.stream().filter(a->!set.add(a.age()))
//		.collect(Collectors.groupingBy(Employee::age,
//				Collectors.summingDouble(Employee::salary)))
//		.forEach((key,value)->System.out.println(key+" - "+value));

		
//		62. Retrieve Employees with Unique Names:
//			  - Find employees with unique names (no duplicate names in the list).

//		list.stream().collect(Collectors.groupingBy(e->e.name(), Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(e->e.getValue()==1)
//		.map(e->e.getKey())
//		.forEach(System.out::println);
		
		
//		63. Find the Names of Employees in Uppercase:
//		   - Get a list of employee names in uppercase.
		
//		list.stream().map(e->e.name().toUpperCase()).forEach(System.out::println);
		
		
//		67. Find Employees with the Same Salary:
//		   - Identify and display employees who have the same salary.
		
//		list.stream().collect(Collectors.groupingBy(Employee::salary, 
//				Collectors.mapping(Employee::name, Collectors.toList())))
//		.entrySet()
//		.stream()
//		.filter(e->e.getValue().size()>1)
//		.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));	
				
//		68. Find the Employee with the Shortest Name Among Male Employees:
//		   - Find the male employee with the shortest name.
		
//		Employee employee = list.stream().filter(e->e.gender().equals("Male"))
//		.min(Comparator.comparingInt(e->e.name().length())).get();
//		
//		System.out.println(employee);
		
		
//		69. Find the Most Common Salary Value:
//		   - Determine the salary value that appears most frequently among the employees.

//		Double double1 = list.stream().collect(Collectors.groupingBy(Employee::salary, Collectors.counting()))
//			.entrySet()
//			.stream()
//			.max(Map.Entry.comparingByValue())
//			.map(Map.Entry::getKey).get();
//		
//		System.out.println(double1);
		
		
//		70. Find the Oldest Employee with the Lowest Salary:
//		   - Find the oldest employee with the lowest salary.		
		
//		Employee employee9 = list.stream()
//				.filter(k->k.age()==list.stream().mapToInt(Employee::age).max().getAsInt())
//				.min(Comparator.comparingDouble(Employee::salary)).get();
//				System.out.println(employee9);
		

//		70. Find the Oldest Employee with the Lowest Salary:
//		   - Find the oldest employee with the lowest salary.		

//		Employee employee = list.stream().filter(k->k.age()==list.stream().mapToInt(Employee::age).max().getAsInt())
//		.min(Comparator.comparing(Employee::salary))
//		.get();
//		
//		System.out.println(employee);

//		71. Find the Most Common Age Among Employees:
//		  - Determine the age that is most common among the employees.
		
		Integer integer = list.stream().collect(Collectors.groupingBy(Employee::age, Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.get();
		
		System.out.println(integer);
		
		
		
		
		
		
		
				
//		 Integer integer = list.stream()
//				.collect(Collectors.groupingBy(Employee::age , Collectors.counting()))
//				.entrySet()
//				.stream()
//				.max(Map.Entry.comparingByValue())
//				.map(Map.Entry::getKey)
//				.get();
//		System.out.println(integer);
		
//		List<String> list1 = Arrays.asList("java","springboot","microservices","api");
//		String name = list1.stream().max(Comparator.comparing(String::length)).get();
//		System.out.println(name);
		
//		72.Partition Employees Based on Salary > 50000
//		   - Return two groups: true and false
		
//		Map<Boolean, List<Employee>> result = list.stream()
//		.collect(Collectors.partitioningBy(e->e.salary() > 50000));
//		
//		
//		result.forEach((key, employees) -> {
//
//		    if (key) {
//		        System.out.println("Employees with Salary > 50000");
//		    } else {
//		        System.out.println("Employees with Salary <= 50000");
//		    }
//
//		    employees.forEach(emp ->
//		            System.out.println(emp.name() + " - " + emp.salary()));
//
//		    System.out.println("-----------------------");
//		});
		
//		77. Find the Employee with the Shortest Name:
//		   - Find the employee with the shortest name.
		
//		Optional<String> map = list.stream().min(Comparator.comparingInt(v->v.name().length()))
//				.map(Employee::name);
//		System.out.println(map);
		
		
//		Optional<Employee> min = list.stream().min(Comparator.comparingInt(value->value.name().length()));
//		System.out.println(min);
		
		
//		84. Calculate the Average Salary of Employees Whose Names Contain Both "A" and "E":
//        - Calculate the average salary of employees whose names contain both the letters "A" and "E."
		
//		List<Employee> collect = list.stream()
//				.filter(e->e.name().toUpperCase().contains("A") && e.name().toUpperCase().contains("E"))
//				.collect(Collectors.toList());
//		collect.forEach(e->System.out.println(e.salary()));		
		
	}
}

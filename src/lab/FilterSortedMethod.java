package lab;

import java.util.Arrays;
import java.util.Comparator;

//record Employee(Integer id, String name, Double salary) {}

public class FilterSortedMethod {
	public static void main(String[] args) {

//		ArrayList<Employee> emp = new ArrayList<>();
//		emp.add(new Employee(111, "Sham", 30000D));
//		emp.add(new Employee(222, "Vijay", 24000D));
//		emp.add(new Employee(111, "Ram", 42000D));
//		emp.add(new Employee(111, "Vijay", 53000D));
//
//		emp.stream().filter(e -> e.salary() > 50000).map(e -> e.name().toUpperCase()).forEach(System.out::println);
//
//		Stream.iterate(1, n -> n+1)
//				.filter(n->n%2!=0)
//				.map(n->n*n)
//				.limit(10) 
//				.forEach(System.out::println);

		int[] arr = { 9, 8, 7, 5, 3, 2, 1 };

		Arrays.stream(arr) // convert int[] to IntStream
				.boxed() // convert int -> Integer (needed for Comparator)
				.sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).forEach(System.out::println);
	}
}

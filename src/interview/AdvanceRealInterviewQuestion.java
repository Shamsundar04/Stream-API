package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Employee(String name, double salary) { }

public class AdvanceRealInterviewQuestion{
	public static void main(String[] args) {
		
		
//		List<Employee> employees = List.of(
//		        new Employee("A", 50000),
//		        new Employee("B", 70000),
//		        new Employee("C", 60000)
//		);
		
//		Double double1 = employees.stream()
//			.map(Employee::salary)
//			.distinct()
//			.sorted(Comparator.reverseOrder())
//			.skip(1)
//			.findFirst()
//			.get();
//		
//		System.out.println(double1);
		
//		Second laregest
		
//		int a[]= {10,5,20,8};
//				
//		Integer integer = Arrays.stream(a)
//			.boxed()
//			.distinct()
//			.sorted(Comparator.reverseOrder())
//			.skip(1)
//			.findFirst()
//			.get();
//		
//		System.out.println(integer);
		
		
		
	
//		Integer integer = Arrays.asList(10,5,20,8)
//			.stream()
//			.distinct()
//			.sorted(Comparator.reverseOrder())
//			.skip(1)
//			.findFirst()
//			.get();		
//		System.out.println(integer);
		
		
		
		
		
		
		
//		Q1.How do you retrieve the 5th element from a List in Java 8?
		
//		List<String> list = Arrays.asList("a","b","c","d","e","f");		
//		System.out.println(list.stream().skip(4).findFirst().get());
//		
//		Optional<String> first = list.stream().skip(4).findFirst();
//		first.ifPresent(System.out::println);
		
//		Q2. Given a String, how do you find the character with the
//		second-highest frequency using Java 8 Streams?
		
//		(For example: "abbcccd" → b=2)

//		String s = "abbcccd";
//		s.chars().forEach(n->System.out.println((char)n));
//		
//		Map<Character, Long> map = s.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(n->n, Collectors.counting()));
//		
//		Character second = map.entrySet().stream()
//				.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
//				.skip(1).findFirst()
//				.get().getKey();
//				System.out.println(second + "=" + map.get(second));
		
		
//		Q.3 Given s = "abcd", how do you generate the pattern
//		abbcccdddd using Java 8 Streams?
//		
//		String s = "abcd";
//		IntStream.range(0, s.length())
//		.mapToObj(i->String.valueOf(s.charAt(i)).repeat(i+1))
//		.forEach(System.out::print);
		
		
//		Q4. How do you sort a list of Employee objects by both name and salary using Java 8?
		
//		List<Employee> employees = List.of(
//			    new Employee("Sham", 50000),
//			    new Employee("Amit", 70000),
//			    new Employee("Amit", 60000),
//			    new Employee("Raj", 45000)
//			);
//		
//		employees.stream().sorted(Comparator.comparing(Employee::name)
//				.thenComparing(Employee::salary))
//		.forEach(e->System.out.println(e));
				
		
		
//		Q5.Given a list of integers, how do you separate the elements into two
//		lists — one containing duplicates and the other containing unique elements
//		using Java 8?
//
//		List<Integer> list = Arrays.asList(1,2,3,1,2,4,5)
		
//		Duplicates [1,2]
//		Unique [3,4,5]
		
//		List<Integer> list = Arrays.asList(1,2,3,1,2,4,5);
		
		
//		Map<Integer, Long> freq = list.stream()
//				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//		
//		List<Integer> duplicate = freq.entrySet().stream().filter(e->e.getValue()>1)
//		.map(Map.Entry::getKey)
//		.collect(Collectors.toList());
//		
//		System.out.println(duplicate);
//		
//		
//		List<Integer> unique = freq.entrySet().stream().filter(e->e.getValue()==1)
//		.map(Map.Entry::getKey)
//		.collect(Collectors.toList());
//		
//		System.out.println(unique);
		
		
		
		
//		Q6. How do you find common elements between two sorted integer lists
//		using Java 8 Streams?
		
//		List<Integer> a = Arrays.asList(1,2,3,4);
//		List<Integer> b = Arrays.asList(2,4,6);
//		
//		List<Integer> collect = a.stream().filter(b::contains).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		
		
		
//		Q.7 From a list of Strings, how do you remove the words that contain
//		any numeric digits using Java 8?
//		(Example: "ab1c" should be removed (here number contains in word))

//		List<String> list=Arrays.asList("abc", "ab1c", "hello", "h3i");
//		
//		List<String> list2 = list.stream().filter(s->s.chars().noneMatch(Character::isDigit))
//		.toList();
//		
//		System.out.println(list2);
		
//		Q.8 Given a sentence, how do you find duplicate words along with their
//		occurrence count, sorted by frequency in descending order?

		String sentence="Java is Java and Java is great";
			
		String[] split = sentence.split(" ");
		
		Map<String, Long> collect = Arrays.stream(split)
				.collect(Collectors.groupingBy(w->w,Collectors.counting()));
		
		List<String> collect2 = collect.entrySet().stream().filter(e->e.getValue()>1)
			.map(e->e.getKey())
			.collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		
		
		
//		Q10.How do you print the top 3 longest Strings from a list using Java 8 Streams?
		
//		List<String> list=Arrays.asList("apple","banana","cherry","watermelon","kiwi","strawberry");		
//		list.stream().sorted(Comparator.comparing(String::length).reversed())
//		.limit(3)
//		.forEach(System.out::println);
		
		
		
		
//		1. Count vowels in a string (using Stream)
		
//		String str = "SpringBootDeveloper";
//		long count = str.chars().filter(c->"aeiouAEIOU".contains(String.valueOf((char)c))).count();
//		System.out.println(count);
		
//		2. Find frequency of each character

//		Return a map of character → count.
//		String str = "banana";
//		str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
//		.forEach((k,v)->System.out.println(k+" - "+v));
		
		
		
//		3. Remove duplicate characters
//		Remove duplicates from string.

//		String input = "programming";
//		Set<Character> set=new HashSet<>();
//		String collect = input.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
//		System.out.println(collect);

//		4. Check if a string is a pangram (contains A–Z)
//		Is the string a pangram? (contains all 26 letters)
 
//		String str = "The quick brown fox jumps over the lazy dog";
//
//		boolean isPangram = str.toLowerCase()
//		                        .chars()
//		                        .filter(Character::isLetter)
//		                        .distinct()
//		                        .count() == 26;
//		System.out.println(isPangram);

		
//		5. Check if a string contains only digits
//		Return true if string = numbers only.
		
//		String str = "123456";
//		boolean allMatch = str.chars().allMatch(Character::isDigit);
//		System.out.println(allMatch);
		
		
//		6. Reverse each word using Streams

//		Input: "Spring Boot Developer"
		
//		String str="Spring Boot Developer";
//		String collect = Arrays.stream(str.split(" "))
//			.map(word-> new StringBuilder(word).reverse().toString())
//			.collect(Collectors.joining(" "));
//		
//		System.out.println(collect);
		
//	here toString because reverse returns the StringBuilder
		
//		7. Sort characters alphabetically
//		Sort characters of string in natural order.

//		String str = "stream";		
//		String string = str.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
//		System.out.println(string);
	
//		8. Find the first non-repeated character
//		Input: "swiss"
//		Output: 'w'

//		String str = "swiss";
//		
//		Character key = str.chars().mapToObj(c->(char)c)
//				.collect(Collectors.groupingBy(c->c,Collectors.counting()))
//				.entrySet()
//				.stream()
//				.filter(e->e.getValue()==1)
//				.findFirst()
//				.get()
//				.getKey();		
//		System.out.println(key);
		
//		char[] charArray = str.toCharArray();
//		
//		for(int i=0;i<charArray.length;i++) {
//			int count=0;
//			
//			for(int j=0;j<charArray.length;j++) {
//				if (str.charAt(i)==str.charAt(j)) {
//					count++;
//				}				
//			}
//			if (count==1) {
//				System.out.println(str.charAt(i));
//				break;
//			}
//		}
		
		
//		9. Find all duplicate characters in a string
//		Input
//		"programming"
		
//		Output
//		[g, r, m]
		
//		String str="programming";		
//		
//		Set<Character> collect = str.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(w->w,Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(c1->c1.getValue()>=2)
//		.map(Map.Entry::getKey)
//		.collect(Collectors.toSet());
//		
//		System.out.println(collect);
		
//		10. Find the most frequent character
		
//		String str = "success";
//		Character character = str.chars().mapToObj(c->(char)c)
//			.collect(Collectors.groupingBy(c->c, Collectors.counting()))
//			.entrySet()
//			.stream()
//			.max(Map.Entry.comparingByValue())
//			.map(Map.Entry::getKey)
//			.orElse(null);
//			
//		System.out.println(character);
		
//		11. Find the longest word from a sentence
		
//		Input
//		"Java Stream API is powerful"
		
//		String sentence="Java Stream API is powerful";
//		Arrays.stream(sentence.split(" "))
//			.max(Comparator.comparingInt(String::length))
//			.ifPresent(System.out::println);
		
		
//		12. Find the second highest occurring character
//		o/p = c
		
//		Character character = str.chars().mapToObj(c->(char)c)
//			.collect(Collectors.groupingBy(c->c, Collectors.counting()))
//			.entrySet()
//			.stream()
//			.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
//			.skip(1)
//			.findFirst()
//			.map(Map.Entry::getKey)
//			.get();
//		
//		System.out.println(character);
		
		
//		13. Group words by their starting letter
//		Input
//		"java jdk jre spring selenium socket"
//		Output
//		{j=[java, jdk, jre], s=[spring, selenium, socket]}

		
//		String input = "java jdk jre spring selenium socket";
//		Map<Character, List<String>> collect = Arrays.stream(input.split(" "))
//			.collect(Collectors.groupingBy(word->word.charAt(0)));
//		System.out.println(collect);
		
		
		
		
		
		
//		Find the third largest distinct number in a list.
		
//		List<String> words = Arrays.asList("Java", "SpringBoot", "Microservices", "API");
//
//		String string = words.stream()
//			.sorted(Comparator.comparingInt(String::length).reversed())
//			.findFirst()
//			.get();
//		
//		System.out.println(string);
		
		
		
//		Find highest even number
		
//		List<Integer> nums = Arrays.asList(10, 15, 20, 25, 40);
//		
//		Integer integer = nums.stream()
//			.filter(n->n%2==0)
//			.sorted(Comparator.reverseOrder())
//			.findFirst()
//			.get();
//		System.out.println(integer);
		
		
//		Find the top 3 largest distinct numbers
		
//		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 50);
//		
//		list.stream()
//			.distinct()
//			.sorted(Comparator.reverseOrder())
//			.limit(3)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		
		
//		Find the second most frequent element
		
		List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3);
		
		list.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()))
		.entrySet()
		.stream();
		
		
		
		
//		https://www.accenture.com/in-en/careers/jobdetails?id=ATCI-5289725-S1944219_en&title=Custom+Software+Engineer
		
	}
}
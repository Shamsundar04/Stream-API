package lab;

import java.util.Arrays;

public class ArrayLogicalQuestionStreamAPI {

	public static void main(String[] args) {  
		
//		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
//		Arrays.stream(numbers)
//		.filter(n->n>0)
//		.forEach(System.out::println);

		
//		WAP to extract First Letter of Each Word from String Array
//		First Letters: [J, A, V, A]

//	     String []names = {"James", "Aryan", "Vibha", "Aniket"};
//	     Arrays.stream(names).map(name->name.charAt(0))
//	     .forEach(System.out::println);
		
		
//		 WAP to convert boolean value to "Yes" or "No"
//		 Yes/No Values: [Yes, No, Yes, No, Yes]
		
//		 Boolean[] flags = {true, false, true, false, true};		 
//		 Arrays.stream(flags).map(value->(value==true)?"Yes":"No").forEach(System.out::println);
		
		
//		WAP to convert Integer Array to String Representation
//	    Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
//	    Integer[] numbers = {10, 20, 30, 40, 50};
//	    Arrays.stream(numbers).map(no->"Number: "+no+", ").forEach(System.out::print);
		
//		WAP to filter Palindrome Words from an Array.
//		Output : Palindrome Words: [madam, racecar, level]
		
//		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
//		Arrays.stream(words).filter(word->isPalindrome(word)).forEach(System.out::println);
		
		
//		WAP to print all the unique numbers from the Array.
//		Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]
		
//	    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
//	    Set<Integer> collect = Arrays.stream(numbers).collect(Collectors.toSet());
//	    System.out.println(collect);
		
//		WAP to print all the names from String array which contains 
//	    letter 'a' in the name.
//	    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
		
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		Arrays.stream(names).filter(name->name.contains("A")||name.contains("a"))
		.forEach(System.out::println);
	}
	
	public static boolean isPalindrome(String value) {
		
		int len = value.length()-1;
		
		for(int i=0;i<value.length();i++) {
			if (value.charAt(i)!=value.charAt(len-i)) {
					return false; 
			}
		}
		return true;
	}	
}
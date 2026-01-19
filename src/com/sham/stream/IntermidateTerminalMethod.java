package com.sham.stream;

import java.util.Arrays;

public class IntermidateTerminalMethod {
	public static void main(String[] args) {
		
//		List<String> listOfName=
//		List.of("Aryan", "Ankit", "Raj", "Ronit", "Aniket", "Raj", "Aryan", "Ajinkya", "Ankit");
	
//		listOfName.stream()
//			.distinct()	//Remove the duplicate
//				.filter(n->n.startsWith("A"))
//					.forEach(System.out::println);
		
		
		int[] numbers= {2,3,4,5,6,7,8,9,10,11,12};
		
		Arrays.stream(numbers)
		.boxed()
		.filter(n->isPrime(n))
		.forEach(System.out::println);
	}
	
	public static boolean isPrime(int n) {
		int count=0;
		
		if (n<2) {
			return false;
		}
		
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==2) {
			return true;
		}

		return false;			
	}
}
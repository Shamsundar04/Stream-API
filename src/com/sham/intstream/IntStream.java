package com.sham.intstream;

import java.util.Arrays;

public class IntStream {
	public static void main(String[] args) {
		
		int arr[]= {1,5,4,5,1,2,3,4,5,6,7,8,9};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		Arrays.stream(arr).min().ifPresent(n->System.out.println(n));
		
		Arrays.stream(arr).max().ifPresent(n->System.out.println(n));
		
		Arrays.stream(arr).average().ifPresent(n->System.out.println(n));
		
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		
		Arrays.stream(arr).distinct().forEach(n->System.out.println(n));
	}
}

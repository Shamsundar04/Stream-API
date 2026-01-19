package com.sham.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

record Product(Integer id, String name, Double price) {}

public class StreamCreation {
	public static void main(String[] args) {

		// 1) By using stream() method of Arrays class
		System.out.println("1) By using stream() & parallelStream() methods");

		List<String> list = Arrays.asList("NIT", "Java", "Stream", "Collection");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);

		System.out.println("++++++++++++++++++++++++++++");

		Stream<String> pStream = list.parallelStream();
		pStream.forEach(System.out::println);


		// 2) By using stream() method of Arrays class
		System.out.println("2) By using stream() method of Arrays class methods");

		int[] x = { 12, 90, 89, 90, 12, 56, 45 };
		IntStream intStream = Arrays.stream(x);
		intStream.forEach(System.out::println);

		long []y = {1L, 2L, 6L, 9L}; 
		LongStream stream2 = Arrays.stream(y); 
		stream2.forEach(System.out::println);
		
		
		System.out.println("...........");
		double [] z = {1D, 2D, 3D, 4D};
		DoubleStream stream3 = Arrays.stream(z);
		stream3.forEach(System.out::println);
		
		
		System.out.println("");
		String []cities = {"Hyd", "Indore", "Pune"};
		Stream<String> stream4 = Arrays.stream(cities);
		stream4.forEach(System.out::println);
		
		
		
		//3) of() static method of Stream interface
		System.out.println("3) By using of() method of Stream interface");
		Product p1 = new Product (333, "Mobile", 12789D);
		Product p2 = new Product (222, "Camera", 54789D);
		Product p3 = new Product (111, "Laptop", 43789D);
		Product p4 = new Product (111, "Laptop", 43789D);
		Stream.of(p1, p2,p3,p4)
		.forEach(System.out::println);
		
		//4) By using iterate() & generate() method [Infinite Stream] 
		
		System.out.println("By using iterate() & generate method [Infinite Stream]");
//		Stream<Double> s1 = Stream.generate(()-> Math.random()).limit(5);
//		s1.forEach(System.out::println);
		Stream<Integer> iterate = Stream.iterate (101, n -> n+2).limit(5);
		iterate.forEach(System.out::println);
	}
}

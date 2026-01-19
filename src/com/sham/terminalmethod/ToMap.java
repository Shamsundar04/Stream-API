package com.sham.terminalmethod;

import java.util.ArrayList;
import java.util.LinkedHashMap;
//import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

record Product(Integer id, String name) {
}

public class ToMap {
	public static void main(String[] args) {

//		Print the length of city and city name

//		List<String> listOfCountry = List.of("India", "Australia", "USA", "China", "Japan");
//		Map<String, Integer> collect = listOfCountry.stream()
//		.collect(Collectors.toMap(String::toUpperCase, String::length));
//		collect.forEach((k, v)->System.out.println(k+"  "+v));

		Product p1 = new Product(111, "Camera");
		Product p2 = new Product(222, "Laptop");
		Product p3 = new Product(222, "Mobile");
		
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(p3);
//		Map<Integer, String> collect = listOfProduct.stream().collect(Collectors.toMap(Product::id, Product::name));
//		System.out.println(collect);
		
//		above code throw exception java.lang.IllegalStateException: Duplicate key 222 (attempted merging values Laptop and Mobile)

		Map<Integer, String> collect = listOfProduct.stream()
				.collect(Collectors.toMap(Product::id, Product::name,(oldKey,newKey)->newKey,LinkedHashMap::new));
		System.out.println(collect);
		
//		<Product, Integer, String, LinkedHashMap<Integer, String>>
//		Collector<Product, ?, LinkedHashMap<Integer, String>> java.util.stream.Collectors.toMap(
//		Function<? super Product, ? extends Integer> keyMapper,
//		Function<? super Product, ? extends String> valueMapper,
//		BinaryOperator<String> mergeFunction,
//		Supplier<LinkedHashMap<Integer, String>> mapFactory
//		)
		
		
//		KeyMapper			Provides key
//		ValueMapper			Provides value
//		Merger Function		Resolves duplicate keys
//		Supplier			Creates empty Map instance
		
		
		
		LinkedHashMap<Integer, String> collect2 = listOfProduct.stream().collect(Collectors.toMap(
			    Product::id,         // KeyMapper   (T → K)
			    Product::name,       // ValueMapper (T → V)
			    (a, b) -> b,         // Merger Function (V,V → V) -> BinaryOperator
			    LinkedHashMap::new   // Supplier (() → Map)
			));
		
		collect2.forEach((a,b)->System.out.println(a+"  "+ b));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

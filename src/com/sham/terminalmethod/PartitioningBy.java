package com.sham.terminalmethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record User(Integer id, String name, Boolean isActive) {}

public class PartitioningBy {
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9};
		
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr)
		.boxed()
		.collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println(collect.get(true));
		System.out.println(collect.get(false));
		
		
		
		User u1=new User(111, "Sham", false);
		User u2=new User(222, "Vijay", true);
		User u3=new User(333, "Ram", false);
		User u4=new User(444, "Vishal", true);
		User u5=new User(555, "Avishkar", false);
		
		
		List<User> users = Arrays.asList(u1,u2,u3,u4,u5);		
		Map<Boolean, List<String>> collect2 = users.stream()
				.collect(Collectors.partitioningBy(User::isActive,
				Collectors.mapping(User::name, Collectors.toList())));
//		
		collect2.forEach((k,v)->System.out.println(k+" "+v));
		
		
	}
}

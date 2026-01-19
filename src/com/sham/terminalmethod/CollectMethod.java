package com.sham.terminalmethod;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

record Trainer(Integer id, String name, Double salary) {}

public class CollectMethod {
	public static void main(String[] args) {
		
//		Print the data in the same order as they inseted in map

		ArrayList<Trainer> listOfTrainers = new ArrayList<>();
		listOfTrainers.add(new Trainer(111, "Scott", 350000D));
		listOfTrainers.add(new Trainer(222, "Smith", 322000D));
		listOfTrainers.add(new Trainer(333, "Alen", 367000D));
		listOfTrainers.add(new Trainer(444, "John", 349000D));
		listOfTrainers.add(new Trainer(111, "Ravi", 350000D));
		
		Map<Integer, String> collect = listOfTrainers.stream()
		.collect(Collectors.toMap(Trainer::id, Trainer::name, (oldKey,newKey)->newKey, LinkedHashMap::new));
		
		collect.forEach((k,v)->System.out.println(k+"  "+v));
	}
}

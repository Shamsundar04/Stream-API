package com.sham.terminalmethod;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapInterview {

	public static void main(String[] args) {
	
		
//		Convert List<String> to Map<length, string> safely handling duplicates
		
		List<String> data = List.of("apple","bat","cat","banana","dog","egg");
		
		Map<Integer, String> map = data.stream()
	            .collect(Collectors.toMap(
	                String::length,        // key = length
	                s -> s,               // value = word itself
	                (oldVal, newVal) -> oldVal + ", " + newVal // merge duplicates
	                ,
	                LinkedHashMap::new
	            ));

	        map.forEach((len, words) -> System.out.println(len + " " + words));

	}

}

package com.sham.terminalmethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
	public static void main(String[] args) {
		
//		Collectors.joining() → Used to concatenate stream elements into a single String.
		
//		It comes in 3 forms:
//		joining() → no delimiter
//		joining(delimiter) → adds separator
//		joining(delimiter, prefix, suffix) → adds start/end text
		
		
		List<String> list = Arrays.asList("a","b","c","d","e","f","g");
		
//		String collect = list.stream().collect(Collectors.joining()); //abcdefg
		
//		String collect = list.stream().collect(Collectors.joining(",")); //a,b,c,d,e,f,g
		
		String collect = list.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect);
	}
}

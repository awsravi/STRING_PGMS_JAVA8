package com.String.p;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersUsingStreams {
	public static void main(String[] args) {
		String str = "hello world";
		Map<Character, Long> charFrequencyMap = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Duplicate characters in the string: ");
		charFrequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

	
		/*
		 * Map<Character, Long> charMap=str.chars().mapToObj(i
		 * ->(char)i).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * 
		 * charMap.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry
		 * -> System.out.println(entry.getKey() +" :" + entry.getValue()));
		 */
		
		
		
	}
}

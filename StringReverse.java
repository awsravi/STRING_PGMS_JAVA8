package com.all.in.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {
	public static void main(String[] args) {

		String str = "ravi kumar";

		List<String> strList = Arrays.asList(str.split(" "));
		
	 String	reverse=strList.stream().map(s ->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
	 System.out.println(reverse);
		
	 //reverse word
	 
	 List<String> word=Arrays.stream(str.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	 System.out.println(word);
	}
}

package com.String.p;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountWithStreams {

	public static void main(String[] args) {
		String str="this is ravi this is kumar";
		String[] str2={"Ravi","Ravi","Kumr"};
		
	Map<String, Long> list=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
	System.out.println(list);
	
	Map<String, Long> list2=Arrays.stream(str2).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
	 System.out.println(list2);
	
	
	
	}
	
	

}

package com.String.p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDupliCount {
public static void main(String[] args) {
	String[] stringArr= {"ravi","manu","viswa","ravi"};
	List<String> liststr=Arrays.asList(stringArr);
	
	Map<String, Long> lSt= liststr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(lSt);
}
}

package com.String.p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntFindDup {
public static void main(String[] args) {
	Integer[] intArr= {1,2,3,3,4,2,5,6};
	
	List<Integer> listInt=Arrays.asList(1,2,3,3,4,2,5,6);
	
	Map<Integer, Long> intlist=listInt.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(intlist);
	
}
}

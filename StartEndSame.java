package com.string;

import java.util.Arrays;
import java.util.List;

public class StartEndSame {
public static void main(String[] args) {
	String[] str={"aba","xyx","abc","ab"};
	
	List<String> straArr= Arrays.asList("aba","xyx","abc","ab");
	
	straArr.stream().filter(s ->s.startsWith(String.valueOf(s.charAt(0))))
	.filter(s ->s.endsWith(String.valueOf(s.charAt(s.length()-1))))
	.forEach(System.out::println);
	
	List<String> lSting = Arrays.asList("cbc", "aba", "xyx", "xyz");
	lSting.stream().filter(s -> s.length() > 0 && s.endsWith(s.valueOf(s.charAt(0)))).forEach(System.out::println);
	
	
	
	
	
	
}
}

package com.string;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StringIntMerge {
	    public static void main(String[] args) {
	        String[] letters = {"A", "B", "C"};
	        int[] numbers = {1, 2, 3};

	        String result = Arrays.stream(letters)
	                .map(letter -> letter + "-" + numbers[Arrays.asList(letters).indexOf(letter)])
	                .collect(Collectors.joining(","));

	        System.out.println(result);
	    }
	}


package com.String.p;

public class ReverseString {
public static void main(String[] args) {
	String input ="abcd";
	
	String reversed = new StringBuilder(input).reverse().toString();
    System.out.println("The reversed string is: " + reversed);
}
}



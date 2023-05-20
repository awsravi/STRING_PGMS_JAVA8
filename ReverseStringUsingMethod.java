package com.string;

public class ReverseStringUsingMethod {
	public static void main(String[] args) {
		String s = "ravi kala";
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		System.out.println(s);
	}
}

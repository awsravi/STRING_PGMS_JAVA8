package com.String.p;


public class ReverseString8 {

	public static void main(String[] args) {

		String inputString = "ABCD";

		String reversed = inputString.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

		System.out.println("The reversed string is: " + reversed);
	}
}

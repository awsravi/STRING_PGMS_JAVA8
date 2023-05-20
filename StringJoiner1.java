package com.java8.quescol;

import java.util.StringJoiner;

public class StringJoiner1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "#soft", "soft#");

		sj.add("ravi");
		sj.add("java");
		sj.add("developer");
		System.out.println(sj);

	}
}

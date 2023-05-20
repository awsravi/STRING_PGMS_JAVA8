package com.infovision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringChatCount {
	public static void main(String[] args) {
		String s = "success";

		// Stream
		Map<String, Long> str = Arrays.asList(s.split("")).stream().sorted()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(str);

	}
}

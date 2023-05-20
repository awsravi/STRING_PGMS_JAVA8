package com.String.p;

import java.util.HashMap;

public class WordcountString {
	public static void main(String[] args) {
		String str = "this is ravi this is kumar";

		HashMap<String, Integer> hm = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {

			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			} else {

				hm.put(word, 1);
			}
		}
		for (String word : hm.keySet()) {
			System.out.println(word + ": " + hm.get(word));
		}

	}

}

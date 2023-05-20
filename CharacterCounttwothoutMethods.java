package com.String.p;

public class CharacterCounttwothoutMethods {

	public static void main(String[] args) {
		
		String str="kula kula viswa ravi";
		
		int count =0;
		boolean isWord=false;
		
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(Character.isLetter(c) || Character.isDigit(c));
			isWord=true;
			if(isWord) {
				count++;
				isWord=false;
				
			}
			
		}
		if(isWord) {
			count++;
			
		}
		System.out.println("word count :: " + count);
	}
	
}

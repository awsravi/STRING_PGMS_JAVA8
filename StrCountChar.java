package com.String.p;

public class StrCountChar {
	
		  public static void main(String[] args) {
		    String input = "abbbc";
		    StringBuilder output = new StringBuilder();

		    int count = 1;
		    for (int i = 0; i < input.length() - 1; i++) {
		      if (input.charAt(i) == input.charAt(i + 1)) {
		        count++;
		      } else {
		        output.append(input.charAt(i)).append(count);
		        count = 1;
		      }
		    }
		    output.append(input.charAt(input.length() - 1)).append(count);

		    System.out.println(output);
		  }
		}



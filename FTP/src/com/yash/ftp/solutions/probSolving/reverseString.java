package com.yash.ftp.solutions.probSolving;

import java.util.HashMap;

public class reverseString {

	static void reverseStringx(String s1) {
		
		System.out.println("\noutput string: ");
		for(int i=s1.length()-1;i>0;i--) {
			System.out.print(s1.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		String s1 = "abdefghi";
		System.out.print("input string: " +s1);
		
		reverseStringx(s1);
	}

}

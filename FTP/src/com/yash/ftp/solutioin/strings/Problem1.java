package com.yash.ftp.solutioin.strings;

import java.util.Scanner;

public class Problem1 {
	
	/*
	1. Create a program in which two string is input by the user and after that user will enter index in
		first string where we want to insert the second string and insert the second string at that index
		and create a new string 
	 */
	public static String insertStringAt(String originalString, String stringToBeInserted, int index) {
		String newString = new String();

		for (int i = 0; i < originalString.length(); i++) {
			newString += originalString.charAt(i);

			if (i == index) 
				newString += stringToBeInserted;
		}

		return newString;
	}

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter string 1:");
			String str1 = sc.nextLine();
			System.out.println("Enter string 2:");
			String str1x = sc.nextLine();
			System.out.println("Enter index:");
			int index = sc.nextInt();
			System.out.println(insertStringAt(str1, str1x, index));
		}

	}

}

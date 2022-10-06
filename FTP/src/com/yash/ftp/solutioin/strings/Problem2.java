package com.yash.ftp.solutioin.strings;

import java.util.Scanner;

public class Problem2 {


	/*
	 2. WAP to print the all alphabets of string in ascending and descending order.
	 */
	public static void sortStringDescending(String str) {
		int MAX_CHAR = 256;
		int charCount[] = new int[MAX_CHAR];

		for (int i = 0; i < str.length(); i++)
			charCount[str.charAt(i) - 'a']++;
		for (int i = MAX_CHAR - 1; i >= 0; i--)
		{
			for (int j = 0; j < charCount[i]; j++)
				System.out.print((char) ('a' + i));
		}
	}
	

	public static void sortStringAscending(String str) {
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);
	}
	
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nEnter string for ascending ascMergeSort");
			String str2 = sc.nextLine();
			sortStringAscending(str2);

			System.out.println("\nEnter string for descending ascMergeSort");
			String str2x = sc.nextLine();
			sortStringDescending(str2x);
		}

	}
	
	

}

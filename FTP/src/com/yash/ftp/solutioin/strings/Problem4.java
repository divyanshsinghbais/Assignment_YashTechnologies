package com.yash.ftp.solutioin.strings;

import java.util.Scanner;

public class Problem4 {
	/*
	 4. WAP to print the number of alphabets repeated in the given string.
	 */
	public static void countOfRepeatedAlphabats(String str) {
		char ch;
		int strLen, i, count, j, k, repChars=0;

		strLen = str.length();
		char[] arr = new char[strLen];

		for(i=0; i<strLen; i++)
			arr[i] = str.charAt(i);

		for(i=0; i<strLen; i++)
		{
			ch = arr[i];
			count = 0;
			for(j=(i+1); j<strLen; j++)
			{
				if(ch==arr[j])
				{
					count++;
					for(k=j; k<(strLen-1); k++)
						arr[k] = arr[k+1];
					strLen--;
					j--;
				}
			}
			if(count>0)
				repChars++;
		}

		System.out.println("\nTotal Number of Repeated Characters = " +repChars);
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nEnter string to print total repeated characters");
			String str4 = sc.nextLine();
			countOfRepeatedAlphabats(str4);
		}
	}
}

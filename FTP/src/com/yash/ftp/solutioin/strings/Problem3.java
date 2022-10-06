/**
 * 
 */
package com.yash.ftp.solutioin.strings;

import java.util.Scanner;

/**
 * @author divyansh.singh
 *
 */
public class Problem3 {
	/*
	 3. WAP to remove all the vowels from the given string
	 */
	public static void removeVowels(String s) {
		System.out.println("String after vowels removal");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}

	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter string for vowels removal");
		String str3 = sc.nextLine();
		removeVowels(str3);

	}

}

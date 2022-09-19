package com.problems;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StringSolutions ss = new StringSolutions();
			
			//1
			System.out.println("Enter string 1:");
			String str1 = sc.nextLine();
			System.out.println("Enter string 2:");
			String str1x = sc.nextLine();
			System.out.println("Enter index:");
			int index = sc.nextInt();
			System.out.println(ss.insertStringAt(str1, str1x, index));
			

			//2
			System.out.println("\nEnter string for ascending sort");
			String str2 = sc.nextLine();
			char ch[] = str2.toCharArray();
			ss.sortStringAscending(ch);

			System.out.println("\nEnter string for descending sort");
			String str2x = sc.nextLine();
			ss.sortStringDescending(str2x);

			//3
			System.out.println("Enter string for vowels removal");
			String str3 = sc.nextLine();
			ss.removeVowels(str3);
			
			//4
			System.out.println("\nEnter string to print total repeated characters");
			String str4 = sc.nextLine();
			ss.countOfRepeatedAlphabats(str4);
			
			//5
			System.out.println("\nPerformance on looping 1 Lac times");
			ss.performanceTestingStringBuffervsBuilder();
			
			//6
			System.out.println("\nEnter a String to pass in comparison showcasing objects in heap memory");
			String i1=sc.nextLine();
			String i2=i1;
			String obj = new String(i1);
			System.out.println("Passing String s1, String s2, String object with value: "+i1);
			ss.stringObjectsInMemory(i1, i2, obj);
			
			//7
			System.out.println("Calling finalize after creating null objects");
			ss.checkGarbageCollector();
			
			
		}


	}
}

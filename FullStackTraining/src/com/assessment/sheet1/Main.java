package com.assessment.sheet1;

import java.util.Scanner;

import com.problems.strings.Sheet1StringSolutions;

public class Main {

	public static void main(String[] args) {

		Sheet1StringSolutions ss = new Sheet1StringSolutions();

		//1
		System.out.println("Enter string 1:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String str1x = sc.nextLine();
		System.out.println("Enter index:");
		int index = sc.nextInt();
		System.out.println(ss.insertStringAt(str1, str1x, index));


		//2
		System.out.println("\nEnter string for ascending sort");
		Scanner sc1 = new Scanner(System.in);
		String str2 = sc1.nextLine();
		ss.sortStringAscending(str2);

		System.out.println("\nEnter string for descending sort");
		Scanner sc2 = new Scanner(System.in);
		String str2x = sc2.nextLine();
		ss.sortStringDescending(str2x);

		//3
		System.out.println("\nEnter string for vowels removal");
		Scanner sc3 = new Scanner(System.in);
		String str3 = sc3.nextLine();
		ss.removeVowels(str3);

		//4
		System.out.println("\nEnter string to print total repeated characters");
		Scanner sc4 = new Scanner(System.in);
		String str4 = sc4.nextLine();
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
		System.out.println("\nCalling finalize after creating null objects");
		ss.checkGarbageCollector();


	}
}

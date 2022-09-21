/**
 * 
 */
package com.assessment.sheet1.view;

import java.util.Arrays;
import java.util.Scanner;

import com.problems.arrays.Sheet1ArraySolutions;
import com.problems.strings.Sheet1StringSolutions;

/**
 * @author divyansh.singh
 *
 */
public class ConsoleView {

	Sheet1StringSolutions string_solutions = new Sheet1StringSolutions();
	Sheet1ArraySolutions array_solutions = new Sheet1ArraySolutions();
	Scanner sc = new Scanner(System.in);

	/*
	 * Console output view
	 */
	public void viewFirst() {

		System.out.println("\nString solutions sheet 1\n");
		
		System.out.println("1. Create a program in which two string is input by the user and after that user will enter index in first string where we want to insert the second string and insert the second string at that index and create a new string.");
		System.out.println("2. WAP to print the all alphabets of string in ascending and descending order.");
		System.out.println("3. WAP to remove all the vowels from the given string.");
		System.out.println("4. WAP to print the number of alphabets repeated in the given string.");
		System.out.println("5. WAP to demonstrate which is fast in processing StringBuilder or StringBuffer");
		System.out.println("6. WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.");
		System.out.println("7. WAP to demonstrate how garbage collector work when any memory is not referenced by string object.");
		
		System.out.println("\nArray solutions sheet 1\n");
		System.out.println("1. Printing third largest element from array");
		System.out.println("2. WAP to find duplicate numbers and there counting from list of numbers.");
		System.out.println("4. An Array contain the n numbers you have to find out combination which satisfy Pythagoras \r\n"
				+ "Template. ");	
	}

	/*
	 * 1
	 */
	public void viewInsertStringAt() {
		//1
		System.out.println("Enter string 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String str1x = sc.nextLine();
		System.out.println("Enter index:");
		int index = sc.nextInt();
		System.out.println(string_solutions.insertStringAt(str1, str1x, index));
	}

	/*
	 * 2
	 */
	public void viewSortStringDescending () {
		
		System.out.println("\nEnter string for ascending ascMergeSort");
		String str2 = sc.nextLine();
		string_solutions.sortStringAscending(str2);

		System.out.println("\nEnter string for descending ascMergeSort");
		String str2x = sc.nextLine();
		string_solutions.sortStringDescending(str2x);
	}

	/*
	 * 3
	 */
	public void viewRemoveVowels () {
		
		System.out.println("\nEnter string for vowels removal");
		String str3 = sc.nextLine();
		string_solutions.removeVowels(str3);
	}

	/*
	 * 4
	 */
	public void viewCountOfRepeatedAlphabats () {
		
		System.out.println("\nEnter string to print total repeated characters");
		String str4 = sc.nextLine();
		string_solutions.countOfRepeatedAlphabats(str4);
	}

	/*
	 * 5
	 */
	public void viewPerformanceTestingStringBuffervsBuilder () {
		//5
		System.out.println("\nPerformance on looping 1 Lac times");
		string_solutions.performanceTestingStringBuffervsBuilder();
	}

	/*
	 * 6
	 */
	public void viewStringObjectsInMemory() {
		//6
		System.out.println("\nEnter a String to pass in comparison showcasing objects in heap memory");
		String i1=sc.nextLine();
		String i2=i1;
		String obj = new String(i1);
		System.out.println("\nPassing String s1, String s2, String object with value: "+i1);
		string_solutions.stringObjectsInMemory(i1, i2, obj);
	}

	/*
	 * 7
	 */
	public void viewCheckGarbageCollector () {
		//7
		System.out.println("\nCalling finalize after creating null objects");
		string_solutions.checkGarbageCollector();
	}

	/*
	 * 8
	 */
	public void viewPrintThirdLargest() {
		//8
		System.out.println("\nEnter the Integer Array size you want to create");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("\nEnter values");
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		array_solutions.printThirdLargest(arr, size);
	}

	/*
	 * 9
	 */
	public void viewPrintDuplicateElements() {
		System.out.println("\nEnter the Integer Array size you want to create");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("\nEnter values");
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		array_solutions.printDuplicateElements(arr, size);
	}

	/*
	 * 10
	 */
	public void viewPrintPythagorasCombination() {
	
		System.out.println("\nEnter the Integer Array size you want to create");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("\nEnter values");
		
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter hypotonous");
		int hypo = sc.nextInt();
		int[] res = array_solutions.getPythagorasCombination(arr, size, hypo);
		System.out.println(Arrays.toString(res));

	}
	

}
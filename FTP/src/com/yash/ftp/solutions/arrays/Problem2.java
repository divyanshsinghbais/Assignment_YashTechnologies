package com.yash.ftp.solutions.arrays;

public class Problem2 {
	
	/*
	 * Printing duplicate element from array in brute force way
	 */

	public static void printDuplicateElements(int[] arr, int size) {
		for(int i = 0; i < size; i++) {  
			for(int j = i + 1; j < size; j++) {  
				if(arr[i] == arr[j])  
					System.out.println(arr[j]);  
			}  
		}  
	}

	public static void main(String[] args) {
		
		int[] arr = {10,40,20,30,90,50,70,80,60};
		printDuplicateElements(arr, arr.length);

	}

}

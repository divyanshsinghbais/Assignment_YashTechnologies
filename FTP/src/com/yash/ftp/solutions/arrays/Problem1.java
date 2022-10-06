package com.yash.ftp.solutions.arrays;

public class Problem1 {

	/*
	 * Problem 1 Printing third largest element from array in O(n) time complexity
	 */
	public static void printThirdLargest(int arr[], int arr_size) {
		/* There should be at-least three elements */
		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

		// Initialize first, second and third Largest element
		int first = arr[0], second = Integer.MIN_VALUE,
				third = Integer.MIN_VALUE;

		// Traverse array elements to find the third Largest
		for (int i = 1; i < arr_size; i++) {
			/* If current element is greater than first,
        then update first, second and third */
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} /* If arr[i] is in between first and second */
			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} /* If arr[i] is in between second and third */
			else if (arr[i] > third) {
				third = arr[i];
			}
		}

		System.out.printf("The third Largest element is %d\n", third);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,40,20,30,90,50,70,80,60};
		printThirdLargest(arr, arr.length);
	}

}

package com.yash.ftp.solutions.arrays;

import java.util.Arrays;

public class CustomSorting {
	static void mySort(Integer[] arr)
	{
		int n = arr.length;

		// Sort the whole array
		Arrays.sort(arr, 0, n/2);
		Arrays.sort(arr, n/2, n);

		// Reverse the second half
		int low = n/2, high = n-1;
		while (low < high)
		{
			Integer temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++; high--;
		} 
	}

	public static void main(String[] args)
	{
		// Array created 
		Integer[] arr = { 6, 2, 320, 1, 16, 23, 4, 90, 67 };
		System.out.println("Input array[] :" +Arrays.toString(arr));
		mySort(arr);
		System.out.println("Custom sorted array[] :" +Arrays.toString(arr));
	}
}
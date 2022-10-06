package com.yash.ftp.solutions.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author divyansh.singh
 */
public class Problem4 {
	
	/*
	 * An Array contain the n numbers you have to find out combination which satisfy Pythagoras Template.
	 */
	public static int[] getPythagorasCombination(int[] arr, int size, int hypo) {

		int[] res = new int[2];
		Arrays.sort(arr);
		
		for(int i=0; i<size-1; i++) {
			if(
				(Math.pow(arr[i],2)) + (Math.pow(arr[i+1],2)) == (Math.pow(hypo,2))	
			  ) {
				res[0]=arr[i];
				res[1]=arr[i+1];		
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			 int arr[] = { 3, 6, 8, 5, 4 };
			
			int hypo = 5;
			int[] res = getPythagorasCombination(arr, arr.length, hypo);
			System.out.println(Arrays.toString(res));
		}
		
		;

	}
	

}

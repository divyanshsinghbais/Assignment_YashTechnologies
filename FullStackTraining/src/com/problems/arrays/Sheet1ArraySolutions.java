package com.problems.arrays;

/**
 * @author divyansh.singh
 */
public class Sheet1ArraySolutions {

	/*
	 * Printing third largest element from array in O(n) time complexity
	 */
	public void printThirdLargest(int arr[], int arr_size) {
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

	/*
	 * Printing duplicate element from array in brute force way
	 */

	public void printDuplicateElements(int[] arr, int size) {
		for(int i = 0; i < size; i++) {  
			for(int j = i + 1; j < size; j++) {  
				if(arr[i] == arr[j])  
					System.out.println(arr[j]);  
			}  
		}  
	}
	
	/*
	 * An Array contain the n numbers you have to find out combination which satisfy Pythagoras Template.
	 */
	public int[] getPythagorasCombination(int[] arr, int size, int hypo) {

		int[] res = new int[2];
		
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
	

}

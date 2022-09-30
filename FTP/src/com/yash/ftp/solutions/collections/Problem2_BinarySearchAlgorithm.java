/**
 * 
 */
package com.yash.ftp.solutions.collections;

/**
 * @author divyansh.singh
 *
 */

/*
 * / Binary search algorithm
1. All the elements must be in sorting order (prerequisite)
2. Take low, high and mid = (low+high)/2
3. Check the searching value with mid
	If searchValue > mid, 
		then search further for second half part
			as set low = mid+1, high remains same & mid = (low+high)/2
			Now repeat 3 

	Else searchValye < mid,
		then search further for first half
			as set low = same, high = mid-1 & mid = (low+high)/2
			Now repeat step 3
4. Return searchValue.

Time complexity: O(logn)- avg case, O(n)- worst case

 */
public class Problem2_BinarySearchAlgorithm {

	/**
	 * @param args
	 */

	public static void searchValueBST(int num, int[] arr) {

		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(num > arr[mid]) {
				low = mid + 1;
			}
			else if(num < arr[mid]) {
				high = mid - 1;
			}
			else {
				System.out.println("Data found in the array: " +num);
				return;
			}
		}
		
		System.out.println("Data not found in the array: " +num);
		
	}

	public static void main(String[] args) {

		int[] arr = {10,20,60,40,30,15,88,90,12};
		
		//Data which is existing in the above array
		int numToSearch = 88;
		searchValueBST(numToSearch, arr);
		numToSearch = 10;
		searchValueBST(numToSearch, arr);
		
		//Data which is not existing in the above array
		numToSearch = 1800;
		searchValueBST(numToSearch, arr);
		

	}

}

package com.yash.ftp.solutions.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  WAP to store elements in List and remove all duplicates value from it. 
 *  (Numbers should be inserted). 
*   When duplicates are removed print all elements in ascending order.
 */

public class Problem4_RemoveDuplicatesAndSort {
	
	public static ArrayList<Integer> removeDuplicatesAndSort(ArrayList<Integer> arrList) {
	
		//result list to return
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		//Traverse the input array list
		for(Integer element : arrList) {
			/*
			 * Add if the element is not in result array
			 */
			if(!res.contains(element)) {
				res.add(element);
			} 
		}

		Collections.sort(res, Collections.reverseOrder());
		return (ArrayList<Integer>) res;
	} 

	public static void main(String[] args) {
		
		//Creating array list default size
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//Insert elements including duplicates
		arrList.add(10);
		arrList.add(10);
		arrList.add(30);
		arrList.add(30);
		arrList.add(20);
		arrList.add(20);
		arrList.add(15);
		arrList.add(15);
		arrList.add(15);
		
		//Print the resulted array list
		System.out.println(removeDuplicatesAndSort(arrList));
		
	}

}

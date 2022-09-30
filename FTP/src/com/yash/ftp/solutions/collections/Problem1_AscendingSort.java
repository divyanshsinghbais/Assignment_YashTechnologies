/**
 * 
 */
package com.yash.ftp.solutions.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author divyansh.singh
 *
 */
public class Problem1_AscendingSort {

	/**
	 * @param args
	 */
	 public static void main(String[] args)
	    {
	        // Create a list of strings
	        ArrayList<String> al = new ArrayList<String>();
	        al.add("E");
	        al.add("B");
	        al.add("A");
	        al.add("D");
	        al.add("C");
	 
	        /* Collections.sort method is sorting the
	        elements of ArrayList in ascending order. */
	        
	        // Time complexity is (n * logn)
	        Collections.sort(al);
	 
	        // Let us print the sorted list
	        System.out.println("List after the use of" +
	                           " Collection.sort() :\n" + al);
	    }

}

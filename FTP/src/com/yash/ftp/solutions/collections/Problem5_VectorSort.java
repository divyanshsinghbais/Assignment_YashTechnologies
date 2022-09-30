/**
 * 
 */
package com.yash.ftp.solutions.collections;

import java.util.Collections;
import java.util.Vector;

/**
 * @author divyansh.singh
 *
 */
public class Problem5_VectorSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        // Creating an empty Vector
        Vector<Integer> vec_tor = new Vector<Integer>();
  
        // Use add() method to add elements in the vector
        vec_tor.add(70);
        vec_tor.add(20);
        vec_tor.add(25);
        vec_tor.add(13);
        vec_tor.add(50);
        vec_tor.add(102);
        vec_tor.add(101);
        
        // Output the present vector
        System.out.println("The current vector is: " + vec_tor);
    
        //Sorting using collection in built method
        Collections.sort(vec_tor);
        
        // Printing the new vector
        System.out.println("The sorted Vector is: " + vec_tor);

	}

}

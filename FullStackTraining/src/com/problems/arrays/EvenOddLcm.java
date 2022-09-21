/**
 * 
 */
package com.problems.arrays;

import java.util.Arrays;

/**
 * @author divyansh.singh
 *
 */
public class EvenOddLcm {

	/**
	 * @param args
	 */
	
	static void coundEvenOdd(int arr[], int arr_size)
    {
        int even_count = 0;
        int odd_count = 0;
 
        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {
             
              // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }
 
        System.out.println("Number of even"
                           + " elements = \n" + even_count
                           + " Number of odd elements = "
                           + odd_count);
    }
	
	
	//LCM
	public static long lcm_of_array_elements(int[] element_array)
    {
        long lcm_of_array_elements = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < element_array.length; i++) {
 
                // lcm_of_array_elements (n1, n2, ... 0) = 0.
                // For negative number we convert into
                // positive and calculate lcm_of_array_elements.
 
                if (element_array[i] == 0) {
                    return 0;
                }
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }
 
                // Divide element_array by devisor if complete
                // division i.e. without remainder then replace
                // number with quotient; used for find next factor
                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }
 
            // If divisor able to completely divide any number
            // from array multiply with lcm_of_array_elements
            // and store into lcm_of_array_elements and continue
            // to same divisor for next factor finding.
            // else increment divisor
            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }
 
            // Check if all element_array is 1 indicate
            // we found all factors and terminate while loop.
            if (counter == element_array.length) {
                return lcm_of_array_elements;
            }
        }
    }
	public static void main(String[] args) {
        int arr[] = { 22, 333, 41, 57, 6000 };
        int n = arr.length;
           
        System.out.println("Input array to find even odd: "+Arrays.toString(arr));
        coundEvenOdd(arr, n);
        
        int[] element_array = { 5, 4, 2, 7, 9 };
        System.out.println("Input array to find lcm: "+Arrays.toString(element_array));
        System.out.println(lcm_of_array_elements(element_array));

	}

}

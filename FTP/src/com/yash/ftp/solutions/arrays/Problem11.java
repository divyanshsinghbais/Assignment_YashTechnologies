/**
 * 
 */
package com.yash.ftp.solutions.arrays;

/**
 * @author divyansh.singh
 *
 */
import java.util.ArrayList;

public class Problem11 {

	// Function to check if given string
	  // is Palindrome or not
	  static boolean isPalindrome(String str)
	  {
	     
	    // Start from leftmost and rightmost corners of str
	    int l = 0;
	    int h = str.length() - 1;
	 
	    // Keep comparing characters while they are same
	    while (h > l)
	    {
	      if (str.charAt(l++) != str.charAt(h--))
	      {
	        return false;
	      }
	    }
	    return true;
	  }
	 
	  // Function to return all Palindrome string
	  static ArrayList<String> PalindromicStrings(String []arr,
	                                      int N)
	  {
	    ArrayList<String> ans = new ArrayList<String>();
	 
	    // Loop to find palindrome string
	    for (int i = 0; i < N; i++) {
	 
	      // Checking if given string is
	      // palindrome or not
	      if (isPalindrome(arr[i])) {
	 
	        // Update answer variable
	        ans.add(arr[i]);
	      }
	    }
	    return ans;
	  }
	 
	  // Driver Code
	  public static void main(String args[])
	  {
	 
	    String []arr
	      = { "aabaa", "dvd", "asfasf", "hola", "pune" };
	    int N = arr.length;
	 
	    // Print required answer
	    ArrayList<String> s = PalindromicStrings(arr, N);
	    if(s.size() == 0)
	      System.out.print("-1");
	    for (String st : s)
	      System.out.print(st + " ");
	 
	  }
	}
/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
   WAP to check the given no is Palindrome or not. Don’t use divide method
 */
@FunctionalInterface
interface MyInterface {
	public boolean checkPalindrome(int x, int y);
}

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Initializing number to enter to check for pallindrome
		int num = 121;
		
		
		int temp = num;

		MyInterface obj = (n, t) -> {

			int r, s=0;			
			while(n > 0) {
				r = n % 10; 
				n = n / 10; 
				s = (s * 10) + r;
			}

			if(t==s)
				return true;
			else
				return false;

		};		

		System.out.println(obj.checkPalindrome(num, temp));

	}

}


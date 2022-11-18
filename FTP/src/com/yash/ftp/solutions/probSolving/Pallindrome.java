package com.yash.ftp.solutions.probSolving;

public class Pallindrome {

	public static boolean stringPallindrome(String str) {

		int i=0,j=str.length()-1;

		while(i<=j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}		
		return true;
	}

	public static boolean numPallindrome(int num) {

		int temp=num;
		int rem,rev = 0;

		while(num>0) {
			rem = num%10;			//get last digit
			rev = (rev*10)+rem;			//add last digit in rev
			num = num/10;			//remove last digit
		}
		
		if(temp!=num)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		String str = "ababababaa";
		int num = 1000;

		if(stringPallindrome(str))
			System.out.println(str+" is pallindrome.");
		else
			System.out.println(str+" not pallindrome.");
		
		if(numPallindrome(num))
			System.out.println(num+" is pallindrome.");
		else
			System.out.println(num+" not pallindrome.");

	}

}

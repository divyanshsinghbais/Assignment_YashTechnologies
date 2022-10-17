package com.yash.ftp.solutions.probSolving;

public class Pallindrome {

	public static boolean ifPallindrome(String str) {
		
		int i=0,j=str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String str = "ababababaa";
		
		if(ifPallindrome(str))
				System.out.println("is pallindrome.");
		else
			System.out.println("not pallindrome.");
	
	}

}

package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
 WAP to check the given sequence of character in given string. 
 Suppose that you are given following string “Taj is situated in Agra.” 
 And you have to find following sequence AST. AST should be one after another. 
 If you found sta, or tas, or tsa it should print string not found.
 */

@FunctionalInterface
interface myInterfaceP2 {
	public boolean checkPattern(String str, String pattern);
}

public class Problem2 {

	public static void main(String[] args) {

		String str = "engineers rock";
		String pattern = " s rock";

		myInterfaceP2 obj = 	(s1, s2) ->	{
			if(s1.contains(s2))
				return true;
			else
				return false;
		};


		System.out.println(obj.checkPattern(str, pattern));
	}
}
package com.yash.ftp.solutions.probSolving;

import java.util.Stack;

/*
Input: str = “((()))()()” 
Output: Balanced
Input: str = “())((())” 
Output: Not Balanced 
 */
public class ValidaParenthesis {

	static boolean checkValidaParenthesis(String str) {

		boolean flag = true;
		int count = 0;
		for(int i=0; i< str.length(); i++) {
			
			if(str.charAt(i)=='(' || str.charAt(i)=='{')
				count++;
			else 
				count--;
			
			if(count<0) {
				flag=false;
				break;
			}
		}
		
		if(count !=0)
			flag=false;
		
		return flag;

	}

	public static void main(String[] args) {
		String s1="(({()}))({}{}{}{{}})()";
		String s2="())()()()))(((";

		System.out.println(checkValidaParenthesis(s1));
		System.out.println(checkValidaParenthesis(s2));
	}

}

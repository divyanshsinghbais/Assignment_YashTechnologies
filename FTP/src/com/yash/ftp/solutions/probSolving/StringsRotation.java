package com.yash.ftp.solutions.probSolving;
//s1=xyz, s2=zxy > true
//s1=xyz, s2=yxz > false
public class StringsRotation {

	private static boolean checkRotation(String s1, String s2) {

		String res = s1+s1;
		
		if(res.indexOf(s2) == -1)
			return false;

		return true;
	}

	public static void main(String[] args) {
		String s1="xyz";
		String s2="yxz";
		System.out.println(checkRotation(s1,s2));
	}

}

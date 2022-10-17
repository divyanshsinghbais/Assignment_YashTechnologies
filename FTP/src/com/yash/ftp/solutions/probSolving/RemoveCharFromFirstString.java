package com.yash.ftp.solutions.probSolving;

public class RemoveCharFromFirstString {

	public static String removeChars(String s1,String s2)
	{

		for(int i=0;i<s2.length();i++) {
			
			char ch = s2.charAt(i);
			
			while(s1.contains(ch+"")) {
				s1=s1.replace(ch+"", "");
			}
		}
		return s1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String string1, string2;
		string1 = "heyeyeyeye";
		string2 = "yh";
		System.out.println(removeChars(string1, string2));
	}

}

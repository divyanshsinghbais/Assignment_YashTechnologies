package com.yash.ftp.solutions.probSolving;
/*
 * Write a program that print number of occurence of 
 * particular word in a string 
 * and print in a descending order
 */
public class Occurences_word_from_String {

	static int countOccurences(String str, String word) {
		
		String s[] = str.split("");
		int count=0;
		for(int i=0; i<s.length; i++) {
			if(word.equals(s[i]))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String str = "kajsbfajsbfajfs a bac";
		String word = " ";
		System.out.println(countOccurences(str, word));
	}

}

package com.yash.ftp.solutions.probSolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,60,60,70,70,90};
		Set<Integer> set = new HashSet<>();
		int min =-1;
		
		//normal loop if need last repeating element.
		for(int i=arr.length-1;i>=0;i--) {
			if(set.contains(arr[i]))
				min = i;
			else
				set.add(arr[i]);
		}
		//reverse loop if need first repeating element.
		if(min != -1)
			System.out.println("Duplicate element found: " +arr[min]);
		else
			System.out.println("No Duplicate");
		
		
		min =-1;
		String s="abfjab";
		char[] ch = s.toCharArray();
		Set<Character> set2 = new HashSet<>();
		
		for(int i=0; i<ch.length; i++) {
			if(set2.contains(ch[i]))
				min = i;
			else
				set2.add(ch[i]);
		}
		if(min!=-1)
			System.out.println(ch[min]);
		else
			System.out.println("no duplicate");
				
		
	}

}

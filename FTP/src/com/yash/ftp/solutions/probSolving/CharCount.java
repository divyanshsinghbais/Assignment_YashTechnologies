package com.yash.ftp.solutions.probSolving;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {
		//Print count of chars from a string
				String str = "Divyanshd";
				//str = str.toLowerCase();
				
				HashMap<Character,Integer> map = new HashMap<>();
				
				for(int i=0; i<str.length();i++) {
					if(map.containsKey(str.charAt(i))) {
						int count = map.get(str.charAt(i));
						map.put(str.charAt(i), ++count);
					}
					else 
						map.put(str.charAt(i), 1);
				}
				System.out.println(map);
				
	}
}

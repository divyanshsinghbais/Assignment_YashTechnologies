package com.yash.ftp.solutions.probSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		//Print count of chars from a string
				String str = "Divyanshd";
				char[] ch = str.toCharArray();	
				
				//Using Hashmap
				Map<Character,Integer> map = new HashMap<>();			
				for(int i=0;i<ch.length;i++) {
					if(map.containsKey(ch[i])) {
						int count=map.get(ch[i]);
						map.put(ch[i], count+1);
					}
					else {
						map.put(ch[i],1);
					}
				}			
				System.out.println(map.toString());
				
				//Using stream API
				Map<String, Long> result =
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s-> s, LinkedHashMap::new, Collectors.counting()));
				
				System.out.println(result);
						
	}
}

/**
 * 
 */
package com.yash.ftp.solutions.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author divyansh.singh
WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and print the detail.
 */
public class Problem6_HashMap_Citynames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{  
			Map<String, Integer> map = new HashMap<String, Integer>(); 
			map.put("City D", 100);
			map.put("City A", 300);
			map.put("City C", 200);
			map.put("City B", 500);
			map.put("City F", 700);
			
			//show hashmap before the sort
			System.out.println("Unsorted hashmap of Cities and Population:");
			for (String name: map.keySet()) {
			    String key = name.toString();
			    String value = map.get(name).toString();
			    System.out.println(key + " " + value);
			}
			
			System.out.println();
			Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map);
			
			//show hashmap after the sort
			System.out.println("Sorted hashmap based on Cities:");
			for (String name: sortedMap.keySet()) {
			    String key = name.toString();
			    String value = sortedMap.get(name).toString();
			    System.out.println(key + " " + value);
			}

		}
	}
}

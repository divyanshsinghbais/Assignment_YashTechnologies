package com.yash.ftp.solutions.probSolving;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class ListAnagram {

	private static String formatting(String s) {
		return Stream.of(s.split("")).sorted().collect(Collectors.joining());
	}

	public static List<Set<String>> getAnagrams(Reader reader) {

		Map<String, Set<String>> map = 
				new BufferedReader(reader).lines()
				.flatMap(Pattern.compile("\\W+")::splitAsStream)
				.collect(Collectors.groupingBy(ListAnagram::formatting, Collectors.toSet()));

		System.out.println("printing map: "+map);	   
		
		return map.values()
				.stream()
				.collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		String s1 = "";
		for(int i=0;i<arr.length;i++) 
			s1+=arr[i] + " ";

		getAnagrams(new StringReader(s1)).forEach(System.out::println);
		
		String x="abc"; 
		String y = "bca";
		boolean check = Stream.of(x.toLowerCase().split(""))
				.sorted().collect(Collectors.joining())
				.equals(Stream.of(y.toLowerCase().split(""))
						.sorted().collect(Collectors.joining())
						);
		
		System.out.println(check);

	}
}
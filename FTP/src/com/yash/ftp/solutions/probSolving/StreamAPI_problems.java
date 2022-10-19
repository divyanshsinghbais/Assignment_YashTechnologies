package com.yash.ftp.solutions.probSolving;

import java.util.ArrayList;
import java.util.stream.IntStream; 
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamAPI_problems {

	public static void main(String[] args) {

		/*
		 * Flat map example 
		 */
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 2));
		list.add(Arrays.asList(3, 4));
		list.add(Arrays.asList(5, 6));
		list.add(Arrays.asList(7, 8));
		System.out.println("List of list-" + list);
		List<Integer> flatList = list.stream()
				.flatMap(l -> l.stream())
				.map(x->x*x)
				.collect(Collectors.toList());
		System.out.println("List generate by flatMap-"+ flatList);
		
		/*
		 * Get duplicates
		 * Input: Stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
			Output: [59, 13]
		 */
		List<Integer> input = Arrays.asList(5,13,4,21,13,27,2,59,59,34);
		Set<Integer> set = new HashSet<>();

		System.out.println("input list: "+input);
		
		input.stream()
		.filter(n -> !set.add(n))
		.collect(Collectors.toSet())
		.forEach(s->System.out.print("Duplicates list: "+s+" "));
		
		/*
		 * Iterate stream with indices
		 * Input: Stream = [G, e, e, k, s]
		*  Output: [0 -> G, 1 -> e, 2 -> e, 3 -> k, 4 -> s]
		 */
		
		String[] arr = {"s","s","a","e","s","a"};
		AtomicInteger index = new AtomicInteger();

		System.out.println("\nString array: "+Arrays.asList(arr));
		
		Arrays.stream(arr)
		.map(str -> index.getAndIncrement() + "->"+str)
		.forEach(System.out::print);
		


	}

}

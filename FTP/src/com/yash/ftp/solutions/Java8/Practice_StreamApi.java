package com.yash.ftp.solutions.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice_StreamApi {

	public static void main(String[] args) {

		Predicate<Integer> pal = (t) -> { 			
			if(t%2 == 0)
				return true;
			else
				return false;
		};	
		System.out.println(pal.test(10));


		//Stream API
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

		Predicate<Integer> predicate2 = (x) -> x > 5;	

		list.stream()
		.filter(predicate2)
		.forEach(System.out::print);

		List<Integer> l =
				list.stream()
				.filter(z-> z>5 && z!=9)
				.collect(Collectors.toList());
		System.out.println(l);
		
		List<List<String>> aList = Arrays.asList(Arrays.asList("a", "b", "c"), 
		        Arrays.asList("c", "d"), Arrays.asList("d", "e", "f"));
		
		List<String> myList= aList.stream()
						.flatMap(x->x.stream())
						.filter(y->!y.equals("d"))
						.collect(Collectors.toList());
		
		System.out.println(myList);
		
		
		ArrayList<ArrayList<Integer>> x = new ArrayList<>();
		x.add(new ArrayList());
		x.add(new ArrayList());
		x.add(new ArrayList());
		x.get(0).add(22);
		x.get(0).add(40);
		x.get(0).add(15);
		x.get(1).add(20);
		x.get(1).add(18);
		x.get(1).add(20);
		x.get(1).add(20);
		x.get(2).add(30);
		x.get(2).add(21);
		
		System.out.println("input lists: " +x);
		
		List<Integer> res = x.stream()
				.flatMap(z->z.stream())
				.filter(y->y>20)
				.sorted()
				.collect(Collectors.toList());
		System.out.println("output list: "+res);
		
	}

}

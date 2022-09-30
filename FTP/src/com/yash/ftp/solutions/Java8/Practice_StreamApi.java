package com.yash.ftp.solutions.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
				.collect(Collectors.toList())
					.forEach(System.out::println);
	}

}

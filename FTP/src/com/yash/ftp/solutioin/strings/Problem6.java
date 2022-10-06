/**
 * 
 */
package com.yash.ftp.solutioin.strings;

import java.util.Scanner;

/**
 * @author divyansh.singh
 *
 */
public class Problem6 {

	/*
	 6. WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool
	 */
	public static void stringObjectsInMemory(String s1, String s2, String obj) {
		if(s1==s2) 
			System.out.println("s1==s2 > True");
		else 
			System.out.println("s1==s2 > False");

		if(s1==obj) 
			System.out.println("obj==s1 > True");
		else 
			System.out.println("obj==s1 > False");
	}
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("\nEnter a String to pass in comparison showcasing objects in heap memory");
			String i1=sc.nextLine();
			String i2=i1;
			String obj = new String(i1);
			System.out.println("\nPassing String s1, String s2, String object with value: "+i1);
			stringObjectsInMemory(i1, i2, obj);
		}

	}

}

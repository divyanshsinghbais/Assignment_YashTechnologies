package com.yash.ftp.solutions.exceptions;


import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		 String fName[] = {"abc","xyz","priya","azhar","neha","anshu","renuka","raj","bhunesh","ayush"};
		 
		 System.out.println("Enter the Index");
		 
		 try {
			 int index = sc.nextInt();
			 System.out.println(fName[index]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
	}

}
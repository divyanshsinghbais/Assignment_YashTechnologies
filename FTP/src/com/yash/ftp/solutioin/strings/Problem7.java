package com.yash.ftp.solutioin.strings;

/**
 * @author divyansh.singh
 *
 */
public class Problem7 {

	/*
	 7. WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
	 */

	public static void checkGarbageCollector() {  

		Sheet1StringSolutions obj=new Sheet1StringSolutions();  
		obj=null;  
		Sheet1StringSolutions a = new Sheet1StringSolutions();
		Sheet1StringSolutions b = new Sheet1StringSolutions();		
		b = a;
		System.gc();  
		/*
		 * Printing null object
		 */
		System.out.println("\n Null object printing: "+a);
	}
	public static void main(String[] args) {
		
		System.out.println("\nCalling finalize after creating null objects");
		checkGarbageCollector();

	}

}

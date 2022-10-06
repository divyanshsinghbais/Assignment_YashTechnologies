/**
 * 
 */
package com.yash.ftp.solutioin.strings;

/*
 * @author divyansh.singh
 	String solutions for PFA assessment sheet 1
 */
public class Sheet1StringSolutions {


	/*
	 6. WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool
	 */
	public void stringObjectsInMemory(String s1, String s2, String obj) {
		if(s1==s2) 
			System.out.println("s1==s2 > True");
		else 
			System.out.println("s1==s2 > False");

		if(s1==obj) 
			System.out.println("obj==s1 > True");
		else 
			System.out.println("obj==s1 > False");
	}

	/*
	 7. WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
	 */

	public void checkGarbageCollector() {  

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
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collection is performed by JVM");
		/*
		 * Compile error at printing null object
		 */
		//System.out.println(a);
	}  
}


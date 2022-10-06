/**
 * 
 */
package com.yash.ftp.solutioin.strings;

/**
 * @author divyansh.singh
 *
 */
public class Problem5 {

	/*
	 5. WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
	 */
	public static void performanceTestingStringBuffervsBuilder() {
		long startTime = System.currentTimeMillis();  
		StringBuffer sb = new StringBuffer("Java");  
		for (int i=0; i<100000; i++){  
			sb.append("Tpoint");  
		}  
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
		startTime = System.currentTimeMillis();  
		StringBuilder sb2 = new StringBuilder("Java");  
		for (int i=0; i<100000; i++){  
			sb2.append("Tpoint");  
		}  
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
	}
	public static void main(String[] args) {

		System.out.println("\nPerformance on looping 1 Lac times");
		performanceTestingStringBuffervsBuilder();

	}

}

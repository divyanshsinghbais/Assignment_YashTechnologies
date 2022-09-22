/**
 * 
 */
package com.yash.ftp.oops;

/**
 * @author divyansh.singh
Create a class Area in which user will be asked to input the sides of shape. 
User will be asked to input three sides of shape. 
If user input two sides of shape same, you have to print area of square for that side. 
With 3 inputs you have to print area of rectangle in combination. 
With 3 sides you have to print the area of triangle. 
Also check the given three sides are belong to right angle triangle or not. 
 */

class Area {
	private static double p,s,ar;

	/**
	 * @param side1
	 * @param side2
	 */
	public Area(int side1, int side2) {
		super();

	}


	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Area(int side1, int side2, int side3) {
		super();
	}

	public static void calculateArea(int side1, int side2) {
		if(side1==side2) {
			System.out.println("Area of square: " +side1*side1);
		}
		else
			System.out.println("Area of rectangle: " +side1*side2);
	}

	public static void calculateArea(int side1, int side2, int side3) {

		if((Math.pow(side1,2)) + (Math.pow(side2,2)) == (Math.pow(side3,2))) 
			System.out.println("It is a right angled traingle.");

		if((Math.pow(side2,2)) + (Math.pow(side3,2)) == (Math.pow(side1,2)))	
			System.out.println("It is a right angled traingle.");

		if((Math.pow(side3,2)) + (Math.pow(side1,2)) == (Math.pow(side2,2)))	
			System.out.println("It is a right angled traingle.");

			p = side1 + side2 + side3;
			s = p/2; 
			ar = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			System.out.println("Area of Traingle: "+ar);
		
	}
}

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create objects of Area class 
		//with input two same sides, two diff sides, three sides with right angled traingle and normal.
		Area.calculateArea(4,4);
		Area.calculateArea(4,6);
		Area.calculateArea(3,7,6);
	}

}

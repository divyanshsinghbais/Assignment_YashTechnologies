/**
 * 
 */
package com.yash.ftp.solutions.oops;


/**
 * @author divyansh.singh
  Create class/interface Shape which will have only one method area. 
Create class Triangle, Square and Rectangle all will extends/implements Shape. 
In class Triangle, Square and Rectangle depending upon the 
number of sides you have to react the co-ordinates of the vertex. For 
example triangle having three vertex so name each vertex A,B and C. 
now you have to read the x & y co-ordinates of A,B and C, after that you 
have find the distance between the vertex A, B and C after this you have 
to calculate the Area and print Area. Same process will be applied while 
calculating area of Square and Rectangle.
 */

interface Shape {
	double area();
}

class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {

		return length * breadth;
	}

}

class Square implements Shape {

	private double side;

	public Square(double side) {
		this.side = side;

	}

	@Override
	public double area() {

		return side * side;
	}

}

class Traingle implements Shape {

	private double x1,y1;
	private double x2,y2;
	private double x3,y3;

	public Traingle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;

	}

	@Override
	public double area() {
		double res = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)) / 2;
		if(res<0) res = res*(-1);
		return res;
	}

}


public class Problem2 {

	/**
	 * @param args
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		double t1, t2;
		t1 = Math.pow((x2 - x1), 2); 
		t2 = Math.pow((y2 - y1), 2);
		return Math.sqrt(t1+t2);
	}
	
	public static void main(String[] args) {
		
		// Input square coordinates		
		double side = distance(0.0,0.0,4.0,0.0);
		Square s = new Square(side);
		
		System.out.println("Square - Area: " + s.area());

		// Input Rectangle coordinates
		double length = distance(-4,-3,-4,1);
		double breadth = distance(-4,1,3,1);
		
		Rectangle r = new Rectangle(length, breadth);
		System.out.println("Rectangle - Area: " + r.area());

		//Input Traingle coordinates	
		double  x1=3.0, y1=4.0, 
				x2=4.0, y2=7.0, 
				x3=6.0, y3=-3.0;
		
		Traingle t = new Traingle(x1,y1,x2,y2,x3,y3);
		System.out.println("Traingle - Area " + t.area());

	}

}

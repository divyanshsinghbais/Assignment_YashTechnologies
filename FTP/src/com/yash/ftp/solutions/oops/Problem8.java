/**
 * 
 */
package com.yash.ftp.solutions.oops;

import java.time.LocalDateTime;

/**
 * @author divyansh.singh
 Perform the following Inheritance map and print the details of each objects. 
Electronics Mobile LCD Laptop Electornics class :- id, semiconductorType, dateOfManufacturing.
Mobile, LCD and Laptop will inherit class electronics, you have to create 
object of Electronic class and instantiate with Mobile, LCD and Laptop 
class. And print the details accordingly
 */

class Electronics
{
	int id;
	String semiconductorType;
	String dateOfManufacturing;
	
	
	public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
	{
		System.out.println("Electronic class method called");
		System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		
	}
	
}

class Mobile extends Electronics
{
	
	
	public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
	{
		System.out.println("Mobile class method called");
		System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
	}
	
}
 class Lcd extends Electronics
 {
	 public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
		{
			System.out.println("LCD class method called");
			System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		}
 }
 
 class Laptop extends Electronics
 {
	 public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
		{
			System.out.println("Laptop class method called");
			System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		}
 }
public class Problem8 {
	
	public static void main(String args[]) 
	{
		Electronics e1=new Mobile();
		Electronics e2=new Lcd();
		Electronics e3=new Laptop();
		e1.getCompare(1,"mobile","10-11-2022");
		e2.getCompare(2, "LCD", "29-05-2022");
		e3.getCompare(3, "Laptop", "23-04-2022");
	}

}
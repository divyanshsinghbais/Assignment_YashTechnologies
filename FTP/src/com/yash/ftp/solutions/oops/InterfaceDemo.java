package com.yash.ftp.solutions.oops;

import java.util.Scanner;

//interface declaration
interface A {
	
	final int a = 8;
	
    default void say() {  
        System.out.println("Program successfully started");  
    }  
    
	void operate(int a, int b);
}

//
class C1 implements A {

	public void operate(int a, int b) {
		System.out.println("Addition performed: " +(a+b));
	}
}

class C2 extends C1 {
	public void operate(int a, int b) {
		System.out.println("Multiplication performed: " +(a*b));
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select operation for input (5, 5)\n1 for addition \n2 for multiplication");
		int inp = sc.nextInt();
		
		if(inp==1) {
			C1 obj = new C1();
			obj.say();
			obj.operate(5, 5);
		}
		if(inp==2) {
			C2 obj = new C2();
			obj.say();
			obj.operate(5, 5);
		}
		
		
		
	}

}

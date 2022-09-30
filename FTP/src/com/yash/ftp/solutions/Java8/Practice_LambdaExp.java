package com.yash.ftp.solutions.Java8;
@FunctionalInterface   
interface TempInterface{  
	public void add(int a, int b);
}  

@FunctionalInterface
interface Hola {
	public void hola(int x);
}

@FunctionalInterface
interface StringLength {
	public int strLen(String str);
}

public class Practice_LambdaExp {  
	public static void main(String[] args) {  

		TempInterface obj = (a, b) -> {
			System.out.println(a+b);
		};
		obj.add(5, 10);

		Hola obj2 = (a) -> {
			System.out.println("Abcde" +a);
			
		};
		obj2.hola(123);

		StringLength obj3 = (str) -> {
			return str.length();
		};
		System.out.println(obj3.strLen("hey"));

		//Multithreading practice using JAVA 8
		Runnable thread1 = () -> {
			for(int i=0; i<5; i++) {
				System.out.println("Value of i: " +i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(thread1);
		t.setName("zoro");
		t.start();
		
		Runnable t2 = () -> {
			System.out.println("Table of 2:");
			for(int i=1; i<=5; i++) {
				System.out.println(2*1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		
		Thread t22 = new Thread(t2);
		t22.start();

	}  
}  
/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
With the help of lambda expression implements Multi-threading. 
Two threads simultaneously work on a resource which is going 
to be increased by one thread and decreased by another thread. 
Thread one will increase resource value by 10% and 
thread two decreased value by 7%. 
This process will continue until user stop the thread.
 */
public class Problem8 {

	static float val = 100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runnable thread1 = () -> {

			float temp=0;
			while(val>0) {
				temp = (7/val) * 100;
				val = val+temp;
				System.out.println("After 7% increment: "+val);
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			return;

		};
		
		Runnable thread2 = () -> {

			float temp=0;
			while(val>0) {
				temp = (10/val) * 100;
				val = val-temp;
				System.out.println("After 10% decrement: "+val);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return;

		};

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.setName("Thread A");
		t2.setName("Thread B");		
		
		t1.start();
		t2.start();

	}

}

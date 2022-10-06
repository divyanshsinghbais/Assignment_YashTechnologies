package com.yash.ftp.solutions.oops;
public class Problem9 {
	
	String obj_name;
	static int count = 0;

	public Problem9(String obj_name) {
		this.obj_name = obj_name;
		++count;
	}

	static void show() {
		// object t1 inside method becomes unreachable when show() removed
		Problem9 t1 = new Problem9("p1");
		display();

	}

	static void display() {
		// object t2 inside method becomes unreachable when display() removed
		Problem9 t2 = new Problem9("p2");
	}

	// Driver method
	public static void main(String args[]) {
		// calling show()
		show();

		// calling garbage collector
		System.gc();
	}

	@Override
	/*
	 * Overriding finalize method to check which object is garbage collected
	 */
	protected void finalize() throws Throwable {
		// will print name of object
		System.out.println(this.obj_name + " Garbage collected  " + "hashcode of object is" + "  "
				+ this.obj_name.hashCode());
		System.out.println("Object in class" + " " + Problem9.count);
	}
}
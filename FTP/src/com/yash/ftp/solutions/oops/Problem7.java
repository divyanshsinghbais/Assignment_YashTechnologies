package com.yash.ftp.solutions.oops;

class Compare {
	String string1 = new String("Divyansh");
	String string2 = new String("Snehal");

	public int comapreString(String string1, String string2) {
		return 0;
	}
}

public class Problem7 extends Compare {

	public int comapreString(String s1, String s2) {
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if ((int) s1.charAt(i) == (int) s2.charAt(i)) {
				continue;
			} else {
				return (int) s1.charAt(i) - (int) s2.charAt(i);
			}
		}

		if (s1.length() < s2.length()) {
			return (s1.length() - s2.length());
		} else if (s1.length() > s2.length()) {
			return (s1.length() - s2.length());
		} else {
			return 0;
		}
	}

	static void getComparisonResult(int l, String s1, String s2) {
		if (l > 0) {
			System.out.println(s1 + " comes after " + s2);
		} else if (l < 0) {
			System.out.println(s1 + " comes before " + s2);
		} else {
			System.out.println(s1 + " and " + s2 + " are equal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Divyansh");
		String s2 = new String("Snehal");
		Problem7 s = new Problem7();
		int l = s.comapreString(s1, s2);
		getComparisonResult(l, s1, s2);

	}

}
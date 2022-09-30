/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
 WAP to insert one string into another string. 
 Also perform garbage collection when insertion is done.
 */
@FunctionalInterface
interface myInterfaceP4 {
	public String insertString(String s1, String s2, int index);
}
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "That's good!";
		String str2 = "not ";
		int index = 6;

		myInterfaceP4 obj = (s1, s2, offset) -> {
			String newString= "";
			
			for (int i = 0; i < s1.length(); i++) {
				newString += s1.charAt(i);
				if (i == offset) {
					newString += s2;
				}
			}
			
			return newString;
		};
		
		System.out.println(obj.insertString(str1, str2, index));

	}

}

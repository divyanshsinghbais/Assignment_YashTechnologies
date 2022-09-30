/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
 *
 */
interface myInterfaceP10 {
	public void printBridgePattern(int n);
}
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		myInterfaceP10 obj = (n) -> {
			if (n <= 0 || n > 26)
			{
				return;
			}
			// Loop controlling variables
			int i = 0, j = 0;
			
			// Display given n
			System.out.print("\nGiven n : " + n + " \n\n");
			
			// iterating the loop through by size n
			for (i = 0; i < n; ++i)
			{
				// Print left side pattern
				for (j = 0; j < n - i; ++j)
				{
					System.out.print((char)('A' + j));
				}
				for (j = 0; j < i + i; ++j)
				{
					// Include intermediate space
					System.out.print(" ");
				}
				// Print right side pattern
				for (j = 'A' + (n - i - 1); j >= 'A'; --j)
				{
					System.out.print((char) j);
				}
				// Include new line
				System.out.print("\n");
			}

		};
	
		//Input
		int num = 8;
		int num2 = 10;

		obj.printBridgePattern(num);
		obj.printBridgePattern(num2);
	}

}

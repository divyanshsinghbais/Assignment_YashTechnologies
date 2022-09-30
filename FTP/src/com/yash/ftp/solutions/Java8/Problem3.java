/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
 User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 454. 
 1 to check given no is even.
 2 for odd number.
 3 for Armstrong number.
 4 for palindrome number. 
 */
@FunctionalInterface
interface myInterfaceP3 {
	public boolean checkEven(int num);
}
@FunctionalInterface
interface MyInterfaceP31 {
	public boolean checkArmstrong(int num);
}
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		myInterfaceP3 obj = (n) -> {
			if(n%2==0)
				return true;
			else
				return false;
		};


		int num1 = 7;
		int num2 = 10;

		//1. Check if number is even	
		if(obj.checkEven(num1))
			System.out.println("Number "+num1 +" is even.");		

		//2. Check if number is odd
		if(!obj.checkEven(num2))		
			System.out.println("Number "+num2 +" is odd");

		//3. Check if number is Arm-strong

		int num3 = 1634;	
		MyInterfaceP31 objx = (n) -> {

			int temp, digits=0, last=0, sum=0;   
			//assigning n into a temp variable  
			temp=n;   
			//loop execute until the condition becomes false  
			while(temp>0)    
			{   
				temp = temp/10;   
				digits++;   
			}   
			temp = n;   
			while(temp>0)   
			{   
				//determines the last digit from the number      
				last = temp % 10;   
				//calculates the power of a number up to digit times and add the resultant to the sum variable  
				sum +=  (Math.pow(last, digits));   
				//removes the last digit   
				temp = temp/10;   
			}  
			//compares the sum with n  
			if(n==sum)   
				//returns if sum and n are equal  
				return true;      
			//returns false if sum and n are not equal  
			else return false;

		};

		System.out.println("Number is armstrong: " +objx.checkArmstrong(num3));

	}

}

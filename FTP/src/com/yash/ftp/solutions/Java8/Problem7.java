/**
 * 
 */
package com.yash.ftp.solutions.Java8;

/**
 * @author divyansh.singh
 WAP to calculate EMI and print the total number of EMIs for 
 given amount, rate of interest and time duration. 
 (Time can also be like this 12 months, 18 months, 24 months etc).
 
 EMI = P × r × (1 + r)n/((1 + r)n - 1) 
 where P= Loan amount, r= interest rate, n=tenure in number of months.
 */
public class Problem7 {

	/**
	 * @param args
	 */
@FunctionalInterface
interface myInterfaceP7 {
	public float EmiCalculator(float loanAmount, float d, float months);
}
	public static void main(String[] args) {
		
		float principal, rate, time, emi;
		
		myInterfaceP7 obj = (p, r, t) -> {
	        
	        r = r / (12 * 100); // one month interest
	        t = t * 12; // one month period
	     
	        return (p * r * (float)Math.pow(1 + r, t))
	                / (float)(Math.pow(1 + r, t) - 1);
		};
		
        // Providing input 
		
        principal = 700000;
        rate = 8;
        //Time taken input in months
        time = 60;
        
        //Time converted to years
        time = time/12;        
        
		System.out.println(obj.EmiCalculator(principal, rate, time));
	}

}

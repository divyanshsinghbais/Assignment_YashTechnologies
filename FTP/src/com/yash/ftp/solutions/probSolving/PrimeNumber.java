package com.yash.ftp.solutions.probSolving;
/**
 * @author divyansh.singh
 */
public class PrimeNumber {

	public static void primeNum(int n) {

		int i,flag=0;

		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else {  
			for(i=2;i<=n/2;i++) {      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}
	}



	public static void primeNumSeries(int n) {
		int i,count;

		System.out.println("Prime numbers between 1 to "+n+" are ");
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;        
				}
			}
			if(count==2)
				System.out.print(j+"  ");     
		} 

	}  

	public static boolean recursionPrime(int n, int i) {

		if(n<=2)
			return (n==2) ? true:false;
				
		if(n%2==0)
			return false;
		
		if(i*i > n)
			return true;
		
        return recursionPrime(n,i+1);
	}


	public static void main(String[] args) {
		
		//primeNum(10);
		//primeNumSeries(30);

		if(recursionPrime(7,2)) 
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		
	}

}


/**
 * 
 */

/**
 * @author divyansh.singh
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */

	public static void primeNum(int n) {

		int i,m=0,flag=0;
		 m=n/2; 

		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}//end of else 
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

	public static void main(String[] args) {
		primeNum(10);
		primeNumSeries(30);
	}

}

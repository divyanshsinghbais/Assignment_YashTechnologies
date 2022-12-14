/**
 * 
 */
package com.yash.ftp.solutions.oops;

/**
 * @author divyansh.singh
 WAP to demonstrate the use of clone method. 
 Clone one object of Product class :- pid, pname, price and unitOfMeasurement. 
 When you clone object of class Product change the product name and price. 
 With the help of instanceOf check that the newly created object is belong to Product class or not.
 */
class Product implements Cloneable
{
     int pid=101;
     String pname="iPhone";
     int price=60000;
     int unitOfMeasurement=3;
     public Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }
     public void getDetails()
     {
         System.out.println(pid+"  "+pname+"  "+price+"  "+unitOfMeasurement);
     }
     
     
}



public class Problem10 {



   public static void main(String[] args) throws CloneNotSupportedException{
        // TODO Auto-generated method stub
        Product p1=new Product();
        p1.getDetails();
        Product t2 = (Product)p1.clone();
        t2.pname="Android";
        t2.price=35000;
        System.out.println(t2.pid+"  "+t2.pname+"  "+t2.price+"  "+t2.unitOfMeasurement);
        
        System.out.println(t2 instanceof Product);



   }



}
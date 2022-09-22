package com.yash.ftp.solutions.arrays;

class Array {
	 
    // Member variables of this class
    // Private access modifier
    private int arr[];
    private int count;
 
    // Note they can only be called through function
 
    // Inside helper class to compute length of an array
    public Array(int length) { 
    	arr = new int[length]; 
    	}
 
    // Method 2
    // Inside helper class
    // To print array
    public void display()
    {
 
        // Iterating over array using for loop
        for (int i = 0; i < count; i++) {
 
            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
    }
 
 
    public void insert(int element)
    {
 
        if (arr.length == count) {
 
            // Creating a new array double the size mentioned above
            int newArr[] = new int[2 * count];
 
            // Iterating over new array using for loop
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
 
            // Assigning new array to original array
            // created above
            arr = newArr;
        }
 
        arr[count++] = element;
    }
}

/**
 * @author divyansh.singh
 *
 */
public class DynamicArray{
	 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of Array(user-defined) class
        Array arr = new Array(3);
 
        System.out.println("Array specified of size 3");
       
        // Custom dynamic input elements more than defined size
        
        arr.insert(40);
        arr.insert(50);
        arr.insert(20);
        arr.insert(88);
 
        System.out.println("Numbers inserted in array of length 4");
        
        // Calling the display() method to print dynamic array
        arr.display();
    }
}
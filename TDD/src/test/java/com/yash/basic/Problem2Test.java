package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem2Test {
	Problem2 f = new Problem2();
	
    @Test
    public void testFactorial1(){  
    	assertEquals(120,f.factorial(5));  
    } 
    
    @Test
    public void testFactorial2(){  
    	assertEquals(130,f.factorial(5));  
    } 
}

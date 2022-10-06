package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem3Test {
	Problem3 e = new Problem3();
	
    @Test
    public void testFindTotalEvenOddDigit1(){  
    	assertEquals("3 4",e.findTotalEvenOddDigit(1234567));  
    } 
    
    @Test
    public void testFindTotalEvenOddDigit2(){  
    	assertEquals("5 6",e.findTotalEvenOddDigit(1234567));  
    } 
}

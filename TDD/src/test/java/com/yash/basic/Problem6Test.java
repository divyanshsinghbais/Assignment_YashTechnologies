package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem6Test {
	Problem6 s = new Problem6();
	
    @Test
    public void testSumOfDigitFromExpression1(){  
    	assertEquals(2107,s.sumOfNumberDivideBy());  
    } 
    
    @Test
    public void testSumOfDigitFromExpression2(){  
    	assertEquals(2106,s.sumOfNumberDivideBy()); 
    }
}

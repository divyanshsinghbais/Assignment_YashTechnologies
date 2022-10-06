package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem4Test {
	Problem4 s = new Problem4();
	
    @Test
    public void testSumOfDigitFromExpression1(){  
    	assertEquals(6,s.sumOfDigitFromExpression("1+2+3"));  
    } 
    
    @Test
    public void testSumOfDigitFromExpression2(){  
    	assertEquals(10,s.sumOfDigitFromExpression("5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3+5+2+3")); 
    }

    
}

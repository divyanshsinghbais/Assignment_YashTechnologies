package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1Test {
    Problem1 con = new Problem1();
    
    @Test
    public void testConsecutive1(){  
    	int a[] = {1,2,3,4,5,6,7,8,9};
        assertEquals(45,con.findConsecutive(a));  
    } 
    
    @Test
    public void testConsecutive2(){  
    	int a[] = {1,2,3,4,5,6,7,8,9};
        assertEquals(46,con.findConsecutive(a));  
    } 
}

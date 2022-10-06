package com.yash.intermediate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Problem6Test {
	Problem6 a = new Problem6();
	
    @Test
    public void numberOfBookWritten1(){  
    	ArrayList<Book> l = new ArrayList<Book>();
        l.add(new Book("abc", 100, "a", true));
        l.add(new Book("xyz", 200, "b", false));
        assertEquals(1,a.numberOfBookWritten(l)); 
    }
    
    @Test
    public void numberOfBookWritten2(){  
    	ArrayList<Book> l = new ArrayList<Book>();
        l.add(new Book("abc", 100, "a", true));
        l.add(new Book("xyz", 200, "b", false));
        assertEquals(12,a.numberOfBookWritten(l));
    }
}

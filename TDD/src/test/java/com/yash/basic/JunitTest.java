package com.yash.basic;
//7,10,11,16

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class JunitTest
{
	@Test(expected = FileNotFoundException.class)
	public void testReadFile() throws IOException { 
		FileReader reader = new FileReader("test.txt");
		reader.read();
		reader.close();}

	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	@Test 
	public void testReadFile3() throws IOException {
		thrown.expect(IOException.class);thrown.expectMessage(startsWith("test.txt (No such file or directory)"));
		FileReader reader = new FileReader("test.txt");
		reader.read();
		reader.close();
	}




}

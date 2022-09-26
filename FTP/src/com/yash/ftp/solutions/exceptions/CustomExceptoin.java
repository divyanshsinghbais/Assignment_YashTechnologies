package com.yash.ftp.solutions.exceptions;

public class CustomExceptoin {
	
	public static int id;
	public static void checkId(int id) throws InvalidIdException {
		
		if(id<1)
			throw new InvalidIdException("Invalid input");
		
	}

	public static void main(String[] args) throws InvalidIdException {
		checkId(0);
		

	}

}

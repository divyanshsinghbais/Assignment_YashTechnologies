package com.problems.strings;
/*
 	String solutions for PFA assessment sheet 1
 */
public class Sheet1StringSolutions {
	/*
	1. Create a program in which two string is input by the user and after that user will enter index in
		first string where we want to insert the second string and insert the second string at that index
		and create a new string 
	 */
	public String insertStringAt(String originalString, String stringToBeInserted, int index)
	{
		String newString = new String();

		for (int i = 0; i < originalString.length(); i++) {
			newString += originalString.charAt(i);

			if (i == index) 
				newString += stringToBeInserted;
		}

		return newString;
	}

	/*
	 2. WAP to print the all alphabets of string in ascending and descending order.
	 */
	public void sortStringDescending(String str) {
		int MAX_CHAR = 256;
		int charCount[] = new int[MAX_CHAR];

		for (int i = 0; i < str.length(); i++)
			charCount[str.charAt(i) - 'a']++;
		for (int i = MAX_CHAR - 1; i >= 0; i--)
		{
			for (int j = 0; j < charCount[i]; j++)
				System.out.print((char) ('a' + i));
		}
	}

	public void sortStringAscending(String str) {
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);
	}


	/*
	 3. WAP to remove all the vowels from the given string
	 */
	public void removeVowels(String s) {
		System.out.println("String after vowels removal");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}

	}

	/*
	 4. WAP to print the number of alphabets repeated in the given string.
	 */
	public void countOfRepeatedAlphabats(String str) {
		char ch;
		int strLen, i, count, j, k, repChars=0;

		strLen = str.length();
		char[] arr = new char[strLen];

		for(i=0; i<strLen; i++)
			arr[i] = str.charAt(i);

		for(i=0; i<strLen; i++)
		{
			ch = arr[i];
			count = 0;
			for(j=(i+1); j<strLen; j++)
			{
				if(ch==arr[j])
				{
					count++;
					for(k=j; k<(strLen-1); k++)
						arr[k] = arr[k+1];
					strLen--;
					j--;
				}
			}
			if(count>0)
				repChars++;
		}

		System.out.println("\nTotal Number of Repeated Characters = " +repChars);
	}

	/*
	 5. WAP to demonstrate which is fast in processing StringBuilder or StringBuffer

	 */
	public void performanceTestingStringBuffervsBuilder() {
		long startTime = System.currentTimeMillis();  
		StringBuffer sb = new StringBuffer("Java");  
		for (int i=0; i<100000; i++){  
			sb.append("Tpoint");  
		}  
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
		startTime = System.currentTimeMillis();  
		StringBuilder sb2 = new StringBuilder("Java");  
		for (int i=0; i<100000; i++){  
			sb2.append("Tpoint");  
		}  
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
	}

	/*
	 6. WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool
	 */
	public void stringObjectsInMemory(String s1, String s2, String obj) {
		if(s1==s2) 
			System.out.println("s1==s2 > True");
		else 
			System.out.println("s1==s2 > False");

		if(s1==obj) 
			System.out.println("obj==s1 > True");
		else 
			System.out.println("obj==s1 > False");
	}

	/*
	 7. WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
	 */

	public void checkGarbageCollector(){  

		Sheet1StringSolutions obj=new Sheet1StringSolutions();  
		obj=null;  
		Sheet1StringSolutions a = new Sheet1StringSolutions();
		Sheet1StringSolutions b = new Sheet1StringSolutions();		
		b = a;
		System.gc();  
	}  
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collection is performed by JVM");
	}  
}

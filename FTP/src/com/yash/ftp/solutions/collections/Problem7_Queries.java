/**
 * 
 */
package com.yash.ftp.solutions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author divyansh.singh
 * 
  WAP to store the student class objects in List. Student class structure :-
Student{ 
 int rollno;
 String sname, classname;
 String totalmarks; // marks out of 500, total five subjects each subject marks 100. 
 }
On the basis of the detail entered by the user. 
Now you have to perform the following operations. 

a) Print the name of students who secure first, second and third position. 
b) Print name of those students who’s marks are below 50%.
c) Print name of those students who’s marks are below 35% it means they are 
fail.
d) Print name of those students who’s marks are above average score. 
e) Print detail of all students on the basis of Name
 */
class Student {

	private int rollNo;
	private String sName, className;
	private int totalMarks;

	/**
	 * @param rollNo
	 * @param sName
	 * @param className
	 * @param inp2
	 */
	public Student(int rollNo, String sName, String className, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.className = className;
		this.totalMarks = totalMarks;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the sName
	 */
	public String getName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}
	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", className=" + className + ", totalMarks="
				+ totalMarks + "]";
	}

}

public class Problem7_Queries {

	static ArrayList<Student> studentList = new ArrayList<Student>();
	static Scanner sc = new Scanner(System.in); 
	static float average;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student obj = new Student(1,"A","C",80);
		Student obj2 = new Student(2,"A","C",90);
		Student obj3 = new Student(3,"B","C",100);
		Student obj4 = new Student(4,"C","C",77);
		Student obj5 = new Student(5,"D","C",65);

		studentList.add(obj);
		studentList.add(obj2);
		studentList.add(obj3);
		studentList.add(obj4);
		studentList.add(obj5);


		// a. Get student list with top three total marks
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getTotalMarks(), o2.getTotalMarks());
			}
		});
		Collections.reverse(studentList);
		
		System.out.println("Student with top three total marks:");
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		System.out.println(studentList.get(2));
		
		//b. get student with percent below 50%
		System.out.println("\nStudents with marks below 50%");
		for(Student s : studentList) {
        	
        	float marks = s.getTotalMarks();
        	float percentage = (float)((marks / 500) * 100);
        	
        	if(percentage < 50) {
        		System.out.println(s);
        	}

        }
        
        //c. get students below 35%
        System.out.println("\nStudents with marks below 35%");
        for(Student s : studentList) {
        	
        	float marks = s.getTotalMarks();
        	float percentage = (float)((marks / 500) * 100);
        
        	if(percentage < 35) {
        		 System.out.println(s);
        	}

        }
        
        //d. calculate and get students with above average    
        for(int i=0; i<studentList.size(); i++) {
        	average += studentList.get(i).getTotalMarks();
        }
        
        average = average/studentList.size();
        
        System.out.println("\nStudents with above average marks: " +average);
        for(Student s : studentList) {
        	if(s.getTotalMarks() > average)
        		System.out.println(s);
        }
        
        //e. All details of student based on names
        
        Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
        	
		});
        
        System.out.println("\nStudent details based of name: ");
        for(Student s : studentList) {
        		System.out.println(s);
        }
       
	
	}



}


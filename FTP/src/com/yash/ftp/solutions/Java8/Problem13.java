/**
 * 
 */
package com.yash.ftp.solutions.Java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author divyansh.singh
 Class Student
{
Int rollno;
LocalDateTime date_of_addmission,dob;
String maths, physics, chemistry, English, hindi; // marks in subjects
String classname;
}
Note:- student who score more than 40 will promoted to next class
1. WAP to print list of all students who’s total marks are less than 40%.
2. WAP to print list of all those students who scored more than 75% in any
of 3 subjects.
3. WAP to print list of all those students who scored more than 75% in all
subjects.
4. WAP to find those students who are fail in at least one subject.
5. Find how many students are promoted to another class.
6. Find how many students need to give exam in two subjects to promoted
to another class
 */
class Student {
	
int rollno;
LocalDateTime date_of_addmission,dob;
String maths, physics, chemistry, English, hindi; // marks in subjects
String classname;

/**
 * @param rollno
 * @param date_of_addmission
 * @param dob
 * @param maths
 * @param physics
 * @param chemistry
 * @param english
 * @param hindi
 * @param classname
 */
public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, String maths, String physics,
		String chemistry, String english, String hindi, String classname) {
	super();
	this.rollno = rollno;
	this.date_of_addmission = date_of_addmission;
	this.dob = dob;
	this.maths = maths;
	this.physics = physics;
	this.chemistry = chemistry;
	English = english;
	this.hindi = hindi;
	this.classname = classname;
}
/**
 * @return the rollno
 */
public int getRollno() {
	return rollno;
}
/**
 * @param rollno the rollno to set
 */
public void setRollno(int rollno) {
	this.rollno = rollno;
}
/**
 * @return the date_of_addmission
 */
public LocalDateTime getDate_of_addmission() {
	return date_of_addmission;
}
/**
 * @param date_of_addmission the date_of_addmission to set
 */
public void setDate_of_addmission(LocalDateTime date_of_addmission) {
	this.date_of_addmission = date_of_addmission;
}
/**
 * @return the dob
 */
public LocalDateTime getDob() {
	return dob;
}
/**
 * @param dob the dob to set
 */
public void setDob(LocalDateTime dob) {
	this.dob = dob;
}
/**
 * @return the maths
 */
public String getMaths() {
	return maths;
}
/**
 * @param maths the maths to set
 */
public void setMaths(String maths) {
	this.maths = maths;
}
/**
 * @return the physics
 */
public String getPhysics() {
	return physics;
}
/**
 * @param physics the physics to set
 */
public void setPhysics(String physics) {
	this.physics = physics;
}
/**
 * @return the chemistry
 */
public String getChemistry() {
	return chemistry;
}
/**
 * @param chemistry the chemistry to set
 */
public void setChemistry(String chemistry) {
	this.chemistry = chemistry;
}
/**
 * @return the english
 */
public String getEnglish() {
	return English;
}
/**
 * @param english the english to set
 */
public void setEnglish(String english) {
	English = english;
}
/**
 * @return the hindi
 */
public String getHindi() {
	return hindi;
}
/**
 * @param hindi the hindi to set
 */
public void setHindi(String hindi) {
	this.hindi = hindi;
}
/**
 * @return the classname
 */
public String getClassname() {
	return classname;
}
/**
 * @param classname the classname to set
 */
public void setClassname(String classname) {
	this.classname = classname;
}

}

public class Problem13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Student> arrList = new ArrayList<Student>();
		
		Student stud1 = new Student(1, LocalDateTime.now(), LocalDateTime.now().minusYears(25), "80", "77", "67", "75", "63", "12");
		Student stud2 = new Student(1, LocalDateTime.now(), LocalDateTime.now().minusYears(25), "70", "72", "77", "75", "60", "12");
		Student stud3 = new Student(1, LocalDateTime.now(), LocalDateTime.now().minusYears(25), "60", "73", "47", "75", "75", "12");
		Student stud4 = new Student(1, LocalDateTime.now(), LocalDateTime.now().minusYears(25), "70", "74", "37", "75", "85", "12");
		Student stud5 = new Student(1, LocalDateTime.now(), LocalDateTime.now().minusYears(25), "90", "75", "68", "75", "95", "12");
		
		arrList.add(stud1);
		arrList.add(stud2);
		arrList.add(stud3);
		arrList.add(stud4);
		arrList.add(stud5);
		
		float[] percentage = new float[arrList.size()];
		
		//Get percentage of all students in sequence in float array
    	for(int i=0; i<arrList.size(); i++) {   	   	 		
    		float marks = Integer.parseInt(arrList.get(i).getChemistry() + arrList.get(i).getEnglish() + arrList.get(i).getHindi()
    	   						+ arrList.get(i).getPhysics() + arrList.get(i).getMaths());
    		percentage[i] = (float)((marks / 500) * 100);       	
    	}    	
    	
  
	}

}



















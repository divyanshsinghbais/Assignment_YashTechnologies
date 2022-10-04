/**
 * 
 */
package com.yash.ftp.solutions.Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
	LocalDate date_of_addmission,dob;
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
	public Student(int rollno, LocalDate date_of_addmission, LocalDate dob, String maths, String physics,
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
	public LocalDate getDate_of_addmission() {
		return date_of_addmission;
	}
	/**
	 * @param date_of_addmission the date_of_addmission to set
	 */
	public void setDate_of_addmission(LocalDate date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
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
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}

}


public class Problem13 {

	//Check if student is failed in any subjects
	static Boolean checkAnyFail(Student s) {  
		if((Float.parseFloat(s.getChemistry()) < 33) 
				|| (Float.parseFloat(s.getEnglish()) < 33)
				|| (Float.parseFloat(s.getMaths()) < 33)
				|| (Float.parseFloat(s.getHindi()) < 33)
				|| (Float.parseFloat(s.getPhysics()) < 33)
				|| (Float.parseFloat(s.getChemistry()) < 33)
				)
			return true;
		else 
			return false;
	}
	
	//Check if student is failed in any subjects
	static Boolean checkPromoted(Student s) {  
		if((Float.parseFloat(s.getChemistry()) < 33) 
				|| (Float.parseFloat(s.getEnglish()) < 33)
				|| (Float.parseFloat(s.getMaths()) < 33)
				|| (Float.parseFloat(s.getHindi()) < 33)
				|| (Float.parseFloat(s.getPhysics()) < 33)
				|| (Float.parseFloat(s.getChemistry()) < 33)
				)
			return false;
		else 
			return true;
	}
	
	//Check if student is failed in exactly two subjects
	static Boolean checkDoubleFail(Student s) {  
		int count = 0;
		if(Float.parseFloat(s.getChemistry()) < 33)
			++count;
		if(Float.parseFloat(s.getEnglish()) < 33)
			++count;
		if(Float.parseFloat(s.getMaths()) < 33)
			++count;
		if(Float.parseFloat(s.getPhysics()) < 33)
			++count;
		if(Float.parseFloat(s.getHindi()) < 33)
			++count;

		if(count == 2)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {

		ArrayList<Student> student_list = new ArrayList<Student>();

		Student s1 = new Student(101, LocalDate.of(2018, Month.APRIL, 01), LocalDate.of(2012, Month.APRIL, 10), "80", "80", "97", "85", "89", "A" );
		Student s2 = new Student(101, LocalDate.of(2018, Month.APRIL, 02), LocalDate.of(2012, Month.MAY, 6), "97", "90", "96", "85", "99", "B" );
		Student s3 = new Student(101, LocalDate.of(2018, Month.APRIL, 03), LocalDate.of(2012, Month.DECEMBER, 3), "70", "60", "67", "65", "69", "A" );
		Student s4 = new Student(101, LocalDate.of(2018, Month.APRIL, 04), LocalDate.of(2012, Month.APRIL, 12), "77", "70", "67", "75", "69", "A" );
		Student s5 = new Student(101, LocalDate.of(2018, Month.APRIL, 05), LocalDate.of(2012, Month.APRIL, 20), "39", "39", "39", "30", "30", "B" );

		student_list.add(s1);
		student_list.add(s2);
		student_list.add(s3);
		student_list.add(s4);
		student_list.add(s5);

		//WAP to print list of all students who’s total marks are less than 40% 	
		System.out.println("List of all students who's total marks are less than 40%: ");
		List<Student> student_list1 = 
				student_list.stream()
				.filter(s -> 
				((Float.parseFloat(s.getMaths()) + Float.parseFloat(s.getEnglish()) + Float.parseFloat(s.getHindi())
				+ Float.parseFloat(s.getPhysics()) + Float.parseFloat(s.getChemistry())) / 500 ) * 100 < 40				
						)
				.collect(Collectors.toList());
		student_list1.forEach(n -> System.out.println(n));


		//WAP to print list of all those students who scored more than 75% in all subjects
		System.out.println("\nList of all students who scored more than 75% in all subjects: ");
		List<Student> student_list2 = 
				student_list.stream()
				.filter(s -> 
				((Float.parseFloat(s.getMaths()) + Float.parseFloat(s.getEnglish()) + Float.parseFloat(s.getHindi())
				+ Float.parseFloat(s.getPhysics()) + Float.parseFloat(s.getChemistry())) / 500 ) * 100 > 75				
						)
				.collect(Collectors.toList());
		student_list2.forEach(n -> System.out.println(n));

		//WAP to find those students who are fail in at least one subject.
		System.out.println("\nList of all students who are fail in at least one subject: ");
		Predicate<Student> checkAnyFail = Problem13::checkAnyFail;
		List<Student> student_list3 =
				student_list.stream()
				.filter(checkAnyFail)
				.collect(Collectors.toList());
		student_list3.forEach(n -> System.out.println(n));

		//Find how many students are promoted to another class.
		System.out.println("\nList of all students who are promoted to another class: ");
		Predicate<Student> checkPromoted = Problem13::checkPromoted;
		List<Student> student_list4 =
				student_list.stream()
				.filter(checkPromoted)
				.collect(Collectors.toList());
		student_list4.forEach(n -> System.out.println(n));

		//Find how many students need to give exam in two subjects to promoted to another class.
		System.out.println("\nList of all students who needs to give two exams to promote to another class: ");

		Predicate<Student> checkDoubleFail = Problem13::checkDoubleFail;

		List<Student> student_list5 =
				student_list.stream()
				.filter(checkDoubleFail)
				.collect(Collectors.toList());
		student_list5.forEach(n -> System.out.println(n));
	}
}








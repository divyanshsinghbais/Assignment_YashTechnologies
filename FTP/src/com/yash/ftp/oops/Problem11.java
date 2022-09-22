package com.yash.ftp.oops;

/*
 * WAP to print the object of Employee class with the help of toString method. 
Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, 
emp_doj. use Date class to store the date of birth(dob) and date of joining(doj). 
 */


import java.util.Date;

class Employee1 {
	int empid;

	String empname;
	int empsalary;
	String empaddress;
	Date emp_dob;

	Date emp_doj;

	public Employee1(int empid, String empname, int empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

}

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Employee1 e = new Employee1(101, "Divyansh", 101, "007 Key", new Date(122, 11, 17), new Date(122, 11, 18));
		System.out.println(e.toString());
	}

}
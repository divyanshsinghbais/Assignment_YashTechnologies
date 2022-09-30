/**
 * 
 */
package com.yash.ftp.solutions.collections;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author divyansh.singh
Consider following class :- class ProductionFacility { 
 int pliid ; String pro_facility_name ; String pro_fa_location ; int totalproduction_perday ; String itemnames[] ; LocalDate prod_date;
}
You have to perform following task:
a) Print the details of facility with highest production per day. 
(you have to add at least 3 days details of each facility 
after that you have to calculate average of 3 days 
on the basis of average you have to print the facility with highest production.
b) Print detail of facility on the basis of names.
c) Print which facility is producing highest item. 
d) Print production detail of each facility on the basis of production date.
 */

class ProductFacility {
	
	private int pid;
	private String pro_facility_name;
	private String pro_facility_location;
	private String pro_facility_totalproduction_perday;
	private String[] itemnames[];
	private LocalDate prod_date;
	/**
	 * @param pro_facility_name
	 * @param pro_facility_location
	 * @param pro_facility_totalproduction_perday
	 * @param itemnames
	 * @param prod_date
	 */
	public ProductFacility(String pro_facility_name, String pro_facility_location,
			String pro_facility_totalproduction_perday, String[][] itemnames, LocalDate prod_date) {
		super();
		this.pro_facility_name = pro_facility_name;
		this.pro_facility_location = pro_facility_location;
		this.pro_facility_totalproduction_perday = pro_facility_totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the pro_facility_name
	 */
	public String getPro_facility_name() {
		return pro_facility_name;
	}
	/**
	 * @param pro_facility_name the pro_facility_name to set
	 */
	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}
	/**
	 * @return the pro_facility_location
	 */
	public String getPro_facility_location() {
		return pro_facility_location;
	}
	/**
	 * @param pro_facility_location the pro_facility_location to set
	 */
	public void setPro_facility_location(String pro_facility_location) {
		this.pro_facility_location = pro_facility_location;
	}
	/**
	 * @return the pro_facility_totalproduction_perday
	 */
	public String getPro_facility_totalproduction_perday() {
		return pro_facility_totalproduction_perday;
	}
	/**
	 * @param pro_facility_totalproduction_perday the pro_facility_totalproduction_perday to set
	 */
	public void setPro_facility_totalproduction_perday(String pro_facility_totalproduction_perday) {
		this.pro_facility_totalproduction_perday = pro_facility_totalproduction_perday;
	}
	/**
	 * @return the itemnames
	 */
	public String[][] getItemnames() {
		return itemnames;
	}
	/**
	 * @param itemnames the itemnames to set
	 */
	public void setItemnames(String[][] itemnames) {
		this.itemnames = itemnames;
	}
	/**
	 * @return the prod_date
	 */
	public LocalDate getProd_date() {
		return prod_date;
	}
	/**
	 * @param prod_date the prod_date to set
	 */
	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}
	@Override
	public String toString() {
		return "ProductFacility [pro_facility_name=" + pro_facility_name + ", pro_facility_location="
				+ pro_facility_location + ", pro_facility_totalproduction_perday=" + pro_facility_totalproduction_perday
				+ ", itemnames=" + Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
	
	
	
}

public class Problem8_ProductFacility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*
a) Print the details of facility with highest production per day. 
(you have to add at least 3 days details of each facility after that you have to calculate average of 3 days 
 */
		
	}

}

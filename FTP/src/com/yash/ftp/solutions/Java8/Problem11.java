/**
 * 
 */
package com.yash.ftp.solutions.Java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author divyansh.singh
 * 
 Class Item
{
	int itemid;
	String iname;
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;
	//setter and getter and constructor
}

1. WAP to find the average price of item from the list of given items.
2. WAP to print detail of item which is having highest and lowest price. (separate programs should be used).
3. WAP to print the item with maximum price and not having any expire date. (item like water bottle, and dresses not having any expiry date)
4. WAP to store item name and price from list to set.
5. WAP to remove duplicate prices from the list of the items.

 */

class Item {
	int itemid;
	String iname;
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;
	/**
	 * @param itemid
	 * @param iname
	 * @param date_of_manufacturing
	 * @param date_of_expiry
	 * @param price
	 */
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	/**
	 * @param itemid
	 * @param iname
	 * @param date_of_manufacturing
	 * @param price
	 */
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.price = price;
	}

	/**
	 * @return the itemid
	 */
	public int getItemid() {
		return itemid;
	}
	/**
	 * @param itemid the itemid to set
	 */
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	/**
	 * @return the iname
	 */
	public String getIname() {
		return iname;
	}
	/**
	 * @param iname the iname to set
	 */
	public void setIname(String iname) {
		this.iname = iname;
	}
	/**
	 * @return the date_of_manufacturing
	 */
	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}
	/**
	 * @param date_of_manufacturing the date_of_manufacturing to set
	 */
	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}
	/**
	 * @return the date_of_expiry
	 */
	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}
	/**
	 * @param date_of_expiry the date_of_expiry to set
	 */
	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}




}

public class Problem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Declaring Array list
		ArrayList<Item> arrList = new ArrayList<Item>();

		Item item1 = new Item(101, "Item A", LocalDateTime.now(), LocalDateTime.now().plusMonths(2), 100);
		Item item2 = new Item(102, "Item B", LocalDateTime.now(), LocalDateTime.now().plusMonths(2), 200);
		Item item3 = new Item(103, "Item C", LocalDateTime.now(), LocalDateTime.now().plusMonths(2), 300);
		Item item4 = new Item(104, "Item D", LocalDateTime.now(), LocalDateTime.now().plusMonths(2), 400);
		Item item5 = new Item(105, "Item E", LocalDateTime.now(), LocalDateTime.now().plusMonths(2), 500);
		Item item6 = new Item(106, "Item F", LocalDateTime.now(), 600);
		Item item7 = new Item(107, "Item G", LocalDateTime.now(), 700);
		Item item8 = new Item(108, "Item A", LocalDateTime.now(), 700);

		//Adding values in array list
		arrList.add(item1);
		arrList.add(item2);
		arrList.add(item3);
		arrList.add(item4);
		arrList.add(item5);
		arrList.add(item6);
		arrList.add(item7);
		arrList.add(item8);

		//Price array list for all items
		ArrayList<Float> arrListFloat = new ArrayList<Float>();
		ArrayList<Float> arrListFloat_withoutExpiry = new ArrayList<Float>();

		//Storing items in array list with expire dates
		for(int i=0; i<arrList.size(); i++) {
			arrListFloat.add(arrList.get(i).getPrice());
		}

		//Storing items in array list without expire dates
		for(int i=0; i<arrList.size(); i++) {
			if(arrList.get(i).getDate_of_expiry() == null)
				arrListFloat_withoutExpiry.add(arrList.get(i).getPrice());
		}


		//Get List of item names and item prices
		ArrayList<String> arrList_names = new ArrayList<String>();
		ArrayList<Float> arrList_prices = new ArrayList<Float>();

		//Storing item's name & item's price in array lists 
		for(int i=0; i<arrList.size(); i++) {
			arrList_names.add(arrList.get(i).getIname());
			arrList_prices.add(arrList.get(i).getPrice());
		}

		//1. Get the average of all prices
		System.out.println("\nAverage of all prices: " 
				+arrListFloat.stream()
				.mapToDouble(d -> d)
				.average()	
				.orElse(0)
				);

		//2.1 Get the highest price of all items.
		System.out.println("\nHighest price of all items: "
				+arrListFloat.stream()
				.mapToDouble(d -> d)
				.max()
				.orElse(0)
				);

		//2.2 Get the lowest price of all items.
		System.out.println("\nLowest price of all items: "
				+arrListFloat.stream()
				.mapToDouble(d -> d)
				.min()
				.orElse(0)
				);

		//3. Get items with maximum price wich are not having expire date.
		System.out.println("\nGet maximum price which doesn't have expiry date: "
				+arrListFloat_withoutExpiry.stream()
				.mapToDouble(d -> d)
				.max()
				.orElse(0));

		//4. Convert item list to item set with name & price.


		Set<String> setOfNames = arrList_names.stream()
				.collect(Collectors.toSet());

		Set<Float> setOfPrices = arrList_prices.stream()
				.collect(Collectors.toSet());

		System.out.println("\nList to Set of item's names: " +setOfNames);
		System.out.println("\nList to Set of item's prices: " +setOfPrices);

		//5. Remove duplicates from the list of all items

		Set<Item> setArrList = arrList.stream()
				.collect(Collectors.toCollection(
						() -> new TreeSet<Item>((p1, p2) -> p1.getIname().compareTo(p2.getIname())) 
						));
		System.out.println("\nRemoving duplicates from list of all items:");
		setArrList.forEach(System.out::println);
	}

}

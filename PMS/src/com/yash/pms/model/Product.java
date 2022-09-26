/**
 * 
 */
package com.yash.pms.model;

/**
 * @author divyansh.singh
 *
 */
public class Product {
	
	private int p_id;
	private String p_name;
	private int p_price;
	/**
	 * @param p_id
	 * @param p_name
	 * @param p_price
	 */
	public Product(int p_id, String p_name, int p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
	}
	/**
	 * @return the p_id
	 */
	public int getP_id() {
		return p_id;
	}
	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	/**
	 * @return the p_name
	 */
	public String getP_name() {
		return p_name;
	}
	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	/**
	 * @return the p_price
	 */
	public int getP_price() {
		return p_price;
	}
	/**
	 * @param p_price the p_price to set
	 */
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}

	
	
	
}

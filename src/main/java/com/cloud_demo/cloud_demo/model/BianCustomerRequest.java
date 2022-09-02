package com.cloud_demo.cloud_demo.model;

public class BianCustomerRequest {
	
	private String _rev;
	private String _id;
	
	private String customer_id;
	private String customer_name;
	private String customer_age;
	private String customer_city;
	public BianCustomerRequest(String _rev, String _id, String customer_id, String customer_name, String customer_age,
			String customer_city) {
		super();
		this._rev = _rev;
		this._id = _id;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_age = customer_age;
		this.customer_city = customer_city;
	}
	public String get_rev() {
		return _rev;
	}
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(String customer_age) {
		this.customer_age = customer_age;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	@Override
	public String toString() {
		return "BianCustomerRequest [_rev=" + _rev + ", _id=" + _id + ", customer_id=" + customer_id
				+ ", customer_name=" + customer_name + ", customer_age=" + customer_age + ", customer_city="
				+ customer_city + "]";
	}
	

}

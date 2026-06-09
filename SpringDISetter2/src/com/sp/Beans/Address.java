package com.sp.Beans;

public class Address {
	private int house_no;
	private String city;
	private int pincode;
	
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", city=" + city + ", pincode=" + pincode + "]";
	}

}

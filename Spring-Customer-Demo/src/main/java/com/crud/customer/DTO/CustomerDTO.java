package com.crud.customer.DTO;

import java.sql.Date;


public class CustomerDTO {

	private String customerName;
	private byte age;
	private String emailId;
	private String address;
	private short yearsasCustomer;
	private long mobileNumber;
	private double totalSpendings;
	private Date dateofBirth;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public short getYearsasCustomer() {
		return yearsasCustomer;
	}
	public void setYearsasCustomer(short yearsasCustomer) {
		this.yearsasCustomer = yearsasCustomer;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getTotalSpendings() {
		return totalSpendings;
	}
	public void setTotalSpendings(double totalSpendings) {
		this.totalSpendings = totalSpendings;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
}

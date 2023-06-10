package com.ims.model;

public class User {

	// Encapsulated Class
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String address;
	private int phoneNumber;
	private int policyID;
	private String status;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(int policyID) {
		super();
		this.policyID = policyID;
	}


	public User(String email, String password, int policyID) {
		super();
		this.email = email;
		this.password = password;
		this.policyID = policyID;
	}


	public User(String firstName, String lastName, String email, String address,
			int phoneNumber, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}


	public User(int policyID, String firstName, String lastName, String email, String address, String userName,int phoneNumber, String status) {
		super();
		this.policyID = policyID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.phoneNumber=phoneNumber;
		this.status=status;
		
	}

	public User(int policyID, String firstName, String lastName, String email, String address, int phoneNumber) {
		super();
		this.policyID = policyID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phoneNumber=phoneNumber;
		
	}
	public User(String firstName, String lastName, String email, String userName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPolicyID() {
		return policyID;
	}

	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

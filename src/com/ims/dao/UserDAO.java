package com.ims.dao;

import java.util.List;

import com.ims.model.User;

public interface UserDAO {

	public void register();

	boolean verifyEmailAndPassword(String email, String pass);

	public String getPassword(String pass);

	public List<User> viewUsers();
	
	//public List<User> policyOnHold(String userEmail);
	public void policyOnHoldUserList(String userEmail);
	
	public List<User> requestPolicy(String userEmail, int policyID);
	
	public List<User> activatePolicy(String userEmail, int policyID);

	public List<User> cancelPolicy(String userEmail, int policyID);


}

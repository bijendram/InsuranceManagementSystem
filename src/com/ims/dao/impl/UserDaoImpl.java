package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ims.dao.UserDAO;
import com.ims.model.User;

public class UserDaoImpl implements UserDAO {

	// reading the data from the console

	Scanner sc = new Scanner(System.in);

	// adding more than one user we use List is used
	public static List<User> userAdd = new ArrayList<User>();
	public static List<User> userListRequestingPolicy = new ArrayList<User>();
	public static List<User> activatedPolicy = new ArrayList<User>();
	public static List<User> cancelPolicy = new ArrayList<User>();
	// public static List<User> policyOnHoldUserList = new ArrayList<User>();
	public static List<User> usersListOfActivatedPolicy = new ArrayList<User>();

	@Override
	public void register() {

		int i = 1;
		while (i == 1) {
			// reading the data from the console and storing it into local variable.
			System.out.println("Enter your first name:");
			String fn = sc.next();
			System.out.println("Enter your last name:");
			String ln = sc.next();
			System.out.println("Enter your email address:");
			String email = sc.next();
			System.out.println("Enter your address:");
			String add = sc.next();
			System.out.println("Enter your phone number:");
			int phone = sc.nextInt();
			System.out.println("Enter your user name:");
			String uname = sc.next();
			System.out.println("Enter your password:");
			String pas = sc.next();

			// initializing the value at the time of object creating (parameterized
			// constructor).

			User user = new User(fn, ln, email, add, phone, uname, pas);
			// adding user object to the ArrayList userAdd.
			userAdd.add(user);
			System.out.println("User registered successfully.");
			System.out.println("Do you want to register more user? Type 1 for Yes / 2 for No");
			i = sc.nextInt();
		}
	}

	@Override
	public List<User> viewUsers() {
		return userAdd;

	}

	@Override
	public boolean verifyEmailAndPassword(String email, String pass) {

		// finding out email and password exists or not.

		for (User user : userAdd) {
			if (user.getEmail().equals(email) && user.getPassword().equals(pass))
				// if user exist return true
				return true;
		} // end of for loop

		return false;
	}

	@Override
	public String getPassword(String email) {

		for (User user : userAdd) {
			if (user.getEmail().equals(email))
				return user.getPassword();
		} // end of for loop
			// if email do not exist return null
		return null;
	}

	@Override
	public List<User> requestPolicy(String userEmail, int policyID) {
		for (User user : userAdd) {
			if (user.getEmail().equals(userEmail)) {
				int pID = user.getPolicyID();
				String fname = user.getFirstName();
				String lname = user.getLastName();
				String email = user.getEmail();
				String uadd = user.getAddress();
				String uname = user.getUserName();
				int uphone = user.getPhoneNumber();
				String status = "Requested";
				User policyrequestlist = new User(pID, fname, lname, email, uadd, uname, uphone, status);
				userListRequestingPolicy.add(policyrequestlist);
			}
		}
		return userListRequestingPolicy;
	}

	public void usersListRequestingPolicy() {
		for (User user : userListRequestingPolicy) {
			System.out.println("Policy ID: " + user.getPolicyID()); // unable to fetch entered policy ID, it give ID as
																	// 0.
			System.out.println("First Name: " + user.getFirstName());
			System.out.println("Last Name: " + user.getLastName());
			System.out.println("Email " + user.getEmail());
			System.out.println("User Name: " + user.getUserName());
			System.out.println("User Address: " + user.getAddress());
			System.out.println("User Phone No.: " + user.getPhoneNumber());
			System.out.println("Status:  " + user.getStatus());

		}
	}

	@Override
	public List<User> activatePolicy(String userEmail, int policyID) { // unable to set status to Activated after
																		// activating
		int i = 0;
		for (User user : userListRequestingPolicy) {
			if (user.getEmail().equals(userEmail) && (user.getPolicyID() == policyID)) {
				int pID = user.getPolicyID();
				String ufname = user.getFirstName();
				String ulname = user.getLastName();
				String uemail = user.getEmail();
				String uAdd = user.getAddress();
				String uname = user.getUserName();
				int uPhone = user.getPhoneNumber();
				String status = "Activated";
				User activatedUserList = new User(pID, ufname, ulname, uemail, uAdd, uname, uPhone, status);
				activatedPolicy.add(activatedUserList);
				i++;
			} // end of if loop
			else {
				if (i == 0)
					System.out.println("The User doesn't exist.");
				// return null;
			}
		} // end of for loop
		return activatedPolicy;
	}

	public void usersListOfActivatedPolicy() {
		for (User user : activatedPolicy) {
			System.out.println("Policy ID: " + user.getPolicyID());
			System.out.println("First Name: " + user.getFirstName());
			System.out.println("Last Name: " + user.getLastName());
			System.out.println("Email " + user.getEmail());
			System.out.println("User Name: " + user.getUserName());
			System.out.println("User Address: " + user.getAddress());
			System.out.println("User Phone No.: " + user.getPhoneNumber());
			System.out.println("Status:  " + user.getStatus());

		}
	}

	@Override
	public List<User> cancelPolicy(String userEmail, int policyID) {// ERROR ON THIS PART

		int i = 0;
		for (User user : activatedPolicy) {
			if (user.getEmail().equals(userEmail) && (user.getPolicyID() == policyID)) {
				int pID = user.getPolicyID();
				String ufname = user.getFirstName();
				String ulname = user.getLastName();
				String uemail = user.getEmail();
				String uAdd = user.getAddress();
				int uPhone = user.getPhoneNumber();
				User cancelledPolicyList = new User(pID, ufname, ulname, uemail, uAdd, uPhone);
				cancelPolicy.add(cancelledPolicyList);
				activatedPolicy.remove(user);
				i++;
			} // end of if loop
			else {
				if (i == 0)
					System.out.println("The user ID and/or policy id doesn't exist.");
			}
		} // end of for loop
		return cancelPolicy;
	}

	@Override
	public void policyOnHoldUserList(String userEmail) {
		int i = 0;
		for (User user : userListRequestingPolicy) {
			if (user.getEmail().equals(userEmail)) {
				System.out.println("Policy ID " + user.getPolicyID());
				System.out.println("First Name " + user.getFirstName());
				System.out.println("Last Name " + user.getLastName());
				System.out.println("Email ID " + user.getEmail());
				System.out.println("Address " + user.getAddress());
				System.out.println("Phone No. " + user.getPhoneNumber());
				i++;
			}
		}
	}
}
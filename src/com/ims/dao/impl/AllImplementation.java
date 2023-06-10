package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ims.dao.AdminDAO;
import com.ims.model.PolicyDetails;

public class AllImplementation implements AdminDAO {
	
	public static List<PolicyDetails> addCategory = new ArrayList<PolicyDetails>();
	public static List<PolicyDetails> addSubCategory = new ArrayList<PolicyDetails>();
	public static List<PolicyDetails> addPolicy = new ArrayList<PolicyDetails>();

//
	@Override
	public boolean verifyAdminUserNameAndPassword(String username, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PolicyDetails> viewCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(int cID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(int cID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSubCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PolicyDetails> viewSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSubCategory(int scID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubCategory(int scID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PolicyDetails> viewPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePolicy(int pID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePolicy(int pID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PolicyDetails> viewPolicyRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activatePolicyRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelPolicyRequest() {
		// TODO Auto-generated method stub
		
	}

	
}

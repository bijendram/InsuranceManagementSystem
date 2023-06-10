package com.ims.dao;

import java.util.List;

import com.ims.model.PolicyDetails;

public interface AdminDAO {

	public boolean verifyAdminUserNameAndPassword(String username, String pass);

	public void addCategory();

	public List<PolicyDetails> viewCategory();
	
	public void updateCategory(int cID);

	public void deleteCategory(int cID);

	//...........................
	
	public void addSubCategory();

	public List<PolicyDetails> viewSubCategory();
	
	public void updateSubCategory(int scID);

	public void deleteSubCategory(int scID);
	
	//...........................

	public void addPolicy();

	public List<PolicyDetails> viewPolicy();
	
	public void updatePolicy(int pID);

	public void deletePolicy(int pID);
	
	//...........................

	public List<PolicyDetails> viewPolicyRequest();

	public void activatePolicyRequest();

	public void cancelPolicyRequest();

}

package com.ims.model;

public class PolicyDetails {

	private int categoryID;
	private String categoryName;

	private int subcategoryID;
	private String subcategoryName;

	private int policyID;
	private String policyName;
	private int sumInsured;

	private String description;
	private String subCategoryDescription;

	
	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public PolicyDetails(int categoryID, String categoryName, int subcategoryID, String subcategoryName,
			String description, String policyName, int policyID) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.subcategoryID = subcategoryID;
		this.subcategoryName = subcategoryName;
		this.policyName = policyName;
		this.policyID = policyID;
	}
	
	public PolicyDetails(int categoryID, String categoryName, String description) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.description = description;
	}


	public PolicyDetails(int policyID, String policyName, int sumInsured, String description) {
		super();
		this.policyID = policyID;
		this.policyName = policyName;
		this.sumInsured = sumInsured;
		this.description = description;
	}


	public PolicyDetails(int categoryID, int subcategoryID, String subcategoryName) {
		super();
		this.categoryID = categoryID;
		this.subcategoryID = subcategoryID;
		this.subcategoryName = subcategoryName;
	}


	public PolicyDetails(String categoryName, int subcategoryID, String subcategoryName) {
		super();
		this.categoryName = categoryName;
		this.subcategoryID = subcategoryID;
		this.subcategoryName = subcategoryName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getSubcategoryID() {
		return subcategoryID;
	}

	public void setSubcategoryID(int subcategoryID) {
		this.subcategoryID = subcategoryID;
	}

	public String getSubcategoryName() {
		return subcategoryName;
	}

	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getPolicyID() {
		return policyID;
	}

	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getSubCategoryDescription() {
		return subCategoryDescription;
	}


	public void setSubCategoryDescription(String subCategoryDescription) {
		this.subCategoryDescription = subCategoryDescription;
	}


	public int getSumInsured() {
		return sumInsured;
	}


	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

}

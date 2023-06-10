package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.model.PolicyDetails;

public class SubCategoryDAOImpl extends AllImplementation {
	static CategoryDaoImpl categoryDAOImpl = new CategoryDaoImpl();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addSubCategory() {
		int i = 1;
		while (i == 1) {
			for (PolicyDetails pod : categoryDAOImpl.viewCategory()) {
				System.out.println("									");
				System.out.println(
						"Category ID: " + " " + pod.getCategoryID() + " " + "Category: " + pod.getCategoryName());
				System.out.println("									");
			}
			System.out.println("Choose category ID for adding sub-category.");
			int cID = sc.nextInt();
			System.out.println("Enter the sub-category ID :");
			System.out.println("Category ID: 1 : Enter 11: Personal, 12: Rental");
			System.out.println("Category ID: 2 : Enter 22: Car, 23: Bike");

			while (!sc.hasNextInt()) {
				System.out.println("Input sub-category number ID: )");
				sc.nextLine();
			}
			int scID = sc.nextInt();
			System.out.println("Enter sub-category name: ");
			String scName = sc.next();


			PolicyDetails pod = new PolicyDetails(cID, scID, scName);
			addSubCategory.add(pod);
			System.out.println("Sub-category registered successfully.");
			System.out.println("Do you like to add more category? Type 1 for Yes / 2 for No");
			i = sc.nextInt();
		}
	}

	@Override
	public List<PolicyDetails> viewSubCategory() {

		return addSubCategory;
	}

	@Override
	public void updateSubCategory(int scID) {

		int i = 0;
		for (PolicyDetails pod : addSubCategory) {
			if (pod.getSubcategoryID() == scID) // if sub-category ID exist
			{
				++i;
				System.out.println(
						"Enter sub-category name tp be modified. (only sub-category name can be modified, Enter 1) ");
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println(
							"Enter updated sub-category name (11: Personal, 12: Rental || 22: Car, 23: Bike): ");
					String scName = sc.next();
					pod.setSubcategoryName(scName);
					System.out.println("Sub-category name is updated.");
					break;

				default:
					System.out.println("Invalid option selected, choose the correct option.");
					sc.close();
					break;
				} // end of switch
			} // end of if
			else {
				//
			}
		} // end of for loop
		if (i == 0)
			System.out.println("The sub-category ID doesn't exist.");
	}

	@Override
	public void deleteSubCategory(int scID) {

		int i = 0;
		for (PolicyDetails pod : addSubCategory) {
			if (pod.getSubcategoryID() == scID) {
				addSubCategory.remove(pod);
				System.out.println("Sub-category has been deleted successfully.");
				i++;
				break;
			} // end of if loop
		} // end of for loop
		if (i == 0)
			System.out.println("The sub-category ID doesn't exist.");
	}

}

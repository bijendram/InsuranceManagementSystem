package com.ims.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.ims.model.PolicyDetails;

public class CategoryDaoImpl extends AllImplementation {

	Scanner sc = new Scanner(System.in);

	@Override
	public boolean verifyAdminUserNameAndPassword(String username, String pass) {
		// TODO Auto-generated method stub

		if ("a".equals(username) && "a".equals(pass)) {
			return true;
		} else {

			return false;
		}
	}

	@Override
	public void addCategory() {

		int i = 1;
		while (i == 1) {

			System.out.println("Enter the category ID (1 for Home / 2 for Auto) : ");
			while (!sc.hasNextInt()) {
				System.out.println("Choose correct category ID no.: 1 or 2");
				sc.nextLine();
			}
			int cID = sc.nextInt();
			System.out.println("Enter category name (Home or Auto): ");
			String cName = sc.next();
			System.out.println("Category description: ");
			String cDes = sc.next();

			PolicyDetails pod = new PolicyDetails(cID, cName, cDes);
			addCategory.add(pod);
			System.out.println("Category registered successfully.");
			System.out.println("Do you like to add more category? Type 1 for Yes / 2 for No");
			i = sc.nextInt();
		}
//		System.out.println(addCategory);
//		System.out.println("\n");

	}

	@Override
	public List<PolicyDetails> viewCategory() {

		return addCategory;
	}

	@Override
	public void updateCategory(int cID) {
		int i = 0;
		for (PolicyDetails pod : addCategory) {
			if (pod.getCategoryID() == cID) // if category ID exist
			{
				++i;
				System.out.println("What do you want to modify/update? 1. Category Name	2. Category Description");
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter updated category name : ");
					String cName = sc.next();
					pod.setCategoryName(cName);
					System.out.println("Category name is updated.");

					break;

				case 2:
					System.out.println("Enter updated category description: ");
					String cDes = sc.next();
					pod.setDescription(cDes);
					System.out.println("Category description is updated.");

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
			System.out.println("The category ID doesn't exist.");
	}

	@Override
	public void deleteCategory(int cID) {
		int i = 0;
		for (PolicyDetails pod : addCategory) {
			if (pod.getCategoryID() == cID) {
				addCategory.remove(pod);
				System.out.println("Category has been deleted successfully.");
				i++;
				break;
			} // end of if loop
		} // end of for loop
		if (i == 0)
			System.out.println("The category ID doesn't exist.");

	}
}
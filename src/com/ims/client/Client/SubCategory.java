package com.ims.client.Client;

import java.util.Scanner;

import com.ims.client.Admin;
import com.ims.dao.impl.CategoryDaoImpl;
import com.ims.dao.impl.SubCategoryDAOImpl;
import com.ims.model.PolicyDetails;

public class SubCategory {

	static SubCategoryDAOImpl subCategoryDAOImpl = new SubCategoryDAOImpl();

	public static void subCategoryDetails() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==============CATEGORY==============");
			System.out.println("                                    ");
			System.out.println("   1. ADD SUB-CATEGORY             	");
			System.out.println("   2. VIEW SUB-CATEGORY            	");
			System.out.println("   3. UPDATE SUB-CATEGORY            ");
			System.out.println("   4. DELETE SUB-CATEGORY            ");
			System.out.println("   5. BACK BACK [ADMIN]				");
			System.out.println("   6. EXIT				            ");
			System.out.println("                                    ");
			System.out.println("====================================");

			System.out.println("Enter your option.");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				subCategoryDAOImpl.addSubCategory();
				break;

			case 2:
				for (PolicyDetails pod : subCategoryDAOImpl.viewSubCategory()) {
					System.out.println("										");
					System.out.println("Sub-category ID: " + " " + pod. getSubcategoryID());
					System.out.println("Sub-category: " + pod.getSubcategoryName());
					System.out.println(".........................................");
					System.out.println("										");
				}
				break;

			case 3:
				System.out.println("Enter the sub-category ID to update (11: Personal, 12: Rental || 22: Car, 23: Bike): ");
				int uscID = sc.nextInt();
				subCategoryDAOImpl.updateSubCategory(uscID);
				break;

			case 4:
				System.out.println("Enter the category ID to delete: ");
				int dscID = sc.nextInt();
				subCategoryDAOImpl.deleteSubCategory(dscID);
				break;

			case 5:
				Admin.adminLogin();
				break;

			case 6:
				System.out.println("Thank you for using the app.");
				System.exit(choice);
				break;

			default:
				System.out.println("Invalid option selected, choice the correct option.");
				sc.close();
				break;

			}

		} // End of while loop
	}
}

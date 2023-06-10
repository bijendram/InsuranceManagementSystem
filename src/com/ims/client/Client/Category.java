package com.ims.client.Client;

import java.util.Scanner;

import com.ims.client.Admin;
import com.ims.dao.impl.CategoryDaoImpl;
import com.ims.model.PolicyDetails;

public class Category {

	static CategoryDaoImpl categoryDAOImpl = new CategoryDaoImpl();

	public static void categoryDetails() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==============CATEGORY==============");
			System.out.println("                                    ");
			System.out.println("   1. ADD CATEGORY              	");
			System.out.println("   2. VIEW CATEGORY              	");
			System.out.println("   3. UPDATE CATEGORY              	");
			System.out.println("   4. DELETE CATEGORY             	");
			System.out.println("   5. BACK [ADMIN]     				");
			System.out.println("   6. EXIT				            ");
			System.out.println("                                    ");
			System.out.println("====================================");

			System.out.println("Enter your option.");
			while (!sc.hasNextInt()) {
				System.out.println("Enter your option: 1 to 6");
				sc.nextLine();
			}
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				categoryDAOImpl.addCategory();
				break;

			case 2:

				for (PolicyDetails pod : categoryDAOImpl.viewCategory()) {
					System.out.println("										");
					System.out.println("Category ID: " + " " + pod.getCategoryID());
					System.out.println("Category: " + pod.getCategoryName());
					System.out.println("Description: " + " " + pod.getDescription());
					System.out.println(".........................................");
					System.out.println("										");
				}
				break;

			case 3:
				System.out.println("Enter the category ID to update: ");
				int ucID = sc.nextInt();
				categoryDAOImpl.updateCategory(ucID);
				break;

			case 4:
				System.out.println("Enter the category ID to delete: ");
				int dcID = sc.nextInt();
				categoryDAOImpl.deleteCategory(dcID);
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

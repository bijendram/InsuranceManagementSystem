package com.ims.client;

import java.util.Scanner;

import com.ims.client.Client.BuyersPolicyRequest;
import com.ims.client.Client.Category;
import com.ims.client.Client.Policy;
import com.ims.client.Client.SubCategory;
import com.ims.dao.impl.UserDaoImpl;
import com.ims.model.User;

public class Admin {

	// public static List<User> userAdd = new ArrayList<User>();
	static UserDaoImpl udi = new UserDaoImpl();

	public static void adminLogin() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=========== ADMIN LOGIN PAGE ============");
			System.out.println("                                         ");
			System.out.println("   1. VIEW USER'S LIST              	 ");
			System.out.println("   2. CATEGORY              			 ");
			System.out.println("   3. SUB-CATEGORY             			 ");
			System.out.println("   4. POLICY			              	 ");
			System.out.println("   5. BUYER'S POLICY REQUEST           	 ");
			System.out.println("   6. BACK           					 ");
			System.out.println("   7. EXIT				              	 ");
			System.out.println("                                         ");
			System.out.println("=========================================");

			System.out.println("Enter your option.");
			while (!sc.hasNextInt()) {
				System.out.println("Enter your option: 1 to 7");
				sc.nextLine();
			}
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				if (UserDaoImpl.userAdd == null || UserDaoImpl.userAdd.size() == 0) {
					System.out.println("No user list exist.");
				} else {
					for (User vuser : udi.viewUsers()) {
						System.out.println("First Name : " + vuser.getFirstName() + " " + "Last Name : "
								+ vuser.getLastName() + " " + "Email : " + vuser.getEmail() + " " + "User Name : "
								+ vuser.getUserName() + " " + "Password : " + vuser.getPassword());
					}
				}

				break;

			case 2:
				Category.categoryDetails();

				break;

			case 3:
				SubCategory.subCategoryDetails();
				break;

			case 4:
				Policy.policyDetails();
				break;

			case 5:
				BuyersPolicyRequest.buyersPolicyDetails();
				break;

			case 6:
				Login.main(null);
				break;

			case 7:
				System.out.println("Thank you for using the app.");
				System.exit(choice);
				break;

			default:
				System.out.println("Invalid option selected, choose the correct option.");
				sc.close();
				break;

			}// End of switch

		} // End of while loop
	}
}
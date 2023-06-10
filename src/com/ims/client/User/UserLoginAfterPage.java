package com.ims.client.User;

import java.util.Scanner;

import com.ims.client.Login;
import com.ims.dao.impl.CategoryDaoImpl;
import com.ims.dao.impl.PolicyDaoImpl;
import com.ims.dao.impl.SubCategoryDAOImpl;
import com.ims.dao.impl.UserDaoImpl;
import com.ims.model.PolicyDetails;
import com.ims.model.User;

public class UserLoginAfterPage {

	static CategoryDaoImpl categoryDAOImpl = new CategoryDaoImpl();
	static SubCategoryDAOImpl subCategoryDAOImpl = new SubCategoryDAOImpl();
	static PolicyDaoImpl policyDaoImpl = new PolicyDaoImpl();
	static UserDaoImpl userDaoImpl = new UserDaoImpl();

	public static void userLoginCategoryDetails() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==============CATEGORY==============");
			System.out.println("                                    ");
			System.out.println("   1. VIEW CATEGORY              	");
			System.out.println("   2. VIEW SUB-CATEGORY            	");
			System.out.println("   3. VIEW POLICY	              	");
			System.out.println("   4. REQUEST POLICY             	");
			System.out.println("   5. VIEW POLICY ON HOLD          	");
			System.out.println("   6. BACK           				");
			System.out.println("   7. EXIT				            ");
			System.out.println("                                    ");
			System.out.println("====================================");

			System.out.println("Enter your option.");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				for (PolicyDetails pod : categoryDAOImpl.viewCategory()) {
					System.out.println("										");
					System.out.println("Category ID: " + " " + pod.getCategoryID());
					System.out.println("Category: " + pod.getCategoryName());
					System.out.println("Description: " + " " + pod.getDescription());
					System.out.println(".........................................");
					System.out.println("										");
				}
				break;

			case 2:
				for (PolicyDetails pod : subCategoryDAOImpl.viewSubCategory()) {
					System.out.println("										");
					System.out.println("Sub-category ID: " + " " + pod.getSubcategoryID());
					System.out.println("Sub-category: " + pod.getSubcategoryName());
					System.out.println(".........................................");
					System.out.println("										");
				}
				break;

			case 3:
				for (PolicyDetails pod : policyDaoImpl.viewPolicy()) {
					System.out.println("										");
					System.out.println("Policy ID: " + " " + pod.getPolicyID());
					System.out.println("Policy Name: " + pod.getPolicyName());
					System.out.println("Policy Insured Amount: " + pod.getSumInsured());
					System.out.println("Description: " + " " + pod.getDescription());
					System.out.println(".........................................");
					System.out.println("										");
				}
				break;

			case 4:

				System.out.println("Enter the email address: ");
				String uEmail = sc.next();
				System.out.println("Enter the password : ");
				String upass = sc.next();
				if (userDaoImpl.verifyEmailAndPassword(uEmail, upass) == true) {
					System.out.println("Enter the policy ID: ");//This policy ID is not reflecting on activatePolicy of UserDaoImpl
					int pID = sc.nextInt();
					//System.out.println("Policy ID Input"+pID);
					userDaoImpl.requestPolicy(uEmail, pID);
					System.out.println("Policy requested successfully.");
				} else {
					System.out.println("The email address doesn't exist.");
				}
				break;

			case 5:
				System.out.println("Enter the email associated with the policy : ");
				String prEmail = sc.next();
				userDaoImpl.policyOnHoldUserList(prEmail);
				break;

			case 6:
				Login.main(null);
				break;

			case 7:
				System.out.println("Thank you for using the app.");
				System.exit(choice);
				break;

			default:
				System.out.println("Invalid option selected, choice the correct option.");
				sc.close();
				break;

			}// End of switch

		} // End of while loop

	}
}

package com.ims.client.Client;

import java.util.Scanner;

import com.ims.client.Admin;
import com.ims.dao.impl.PolicyDaoImpl;
import com.ims.model.PolicyDetails;

public class Policy {

	static PolicyDaoImpl policyDaoImpl = new PolicyDaoImpl();
	
	public static void policyDetails() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=================POLICY=================");
			System.out.println("                                        ");
			System.out.println("   1. ADD POLICY		              	");
			System.out.println("   2. VIEW POLICY           		  	");
			System.out.println("   3. UPDATE POLICY		              	");
			System.out.println("   4. DELETE POLICY		             	");
			System.out.println("   5. BACK [ADMIN]      				");
			System.out.println("   6. EXIT				              	");
			System.out.println("                                        ");
			System.out.println("========================================");

			System.out.println("Enter your option.");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				policyDaoImpl.addPolicy();
				break;

			case 2:
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

			case 3:
				System.out.println("Enter the policy ID to update.");
				int upID=sc.nextInt();
				policyDaoImpl.updatePolicy(upID);
				
				break;

			case 4:
				System.out.println("Enter the policy ID to delete.");
				int dpID=sc.nextInt();
				policyDaoImpl.deletePolicy(dpID);
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

package com.ims.client.Client;

import java.util.Scanner;

import com.ims.client.Admin;
import com.ims.dao.impl.UserDaoImpl;

public class BuyersPolicyRequest {

	static UserDaoImpl userDaoImpl = new UserDaoImpl();

	public static void buyersPolicyDetails() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==========BUYER'S POLICY REQUEST=========");
			System.out.println("                                        ");
			System.out.println("   1. VIEW POLICY REQUEST              	");
			System.out.println("   2. ACTIVATE POLICY REQUEST          	");
			System.out.println("   3. CANCEL POLICY REQUEST            	");
			System.out.println("   4. BACK           					");
			System.out.println("   5. EXIT				              	");
			System.out.println("                                        ");
			System.out.println("=========================================");

			System.out.println("Enter your option.");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Requested Policies:");
				System.out.println("					");
				userDaoImpl.usersListRequestingPolicy();
				break;

			case 2:
				System.out.println("Enter the email address: ");
				String uEmail = sc.next();
				System.out.println("Enter the Policy ID: ");
				int pID = sc.nextInt();
				userDaoImpl.activatePolicy(uEmail, pID);
				System.out.println("Policy activated!");
				break;

			case 3:
				System.out.println("Enter the email address: ");
				String ucEmail = sc.next();
				System.out.println("Enter the Policy ID: ");
				int pcID = sc.nextInt();
				userDaoImpl.cancelPolicy(ucEmail, pcID);
				System.out.println("Policy cancelled!");
				break;

			case 4:
				Admin.adminLogin();
				break;

			case 5:
				System.out.println("Thank you for using the app.");
				System.exit(choice);
				break;

			default:
				System.out.println("Invalid option selected, choice the correct option.");
				break;

			}

		} // End of while loop
	}

}

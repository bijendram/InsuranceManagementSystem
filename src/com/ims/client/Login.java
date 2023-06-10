package com.ims.client;

import java.util.Scanner;

import com.ims.dao.impl.CategoryDaoImpl;
import com.ims.dao.impl.UserDaoImpl;
import com.ims.client.User.UserLoginAfterPage;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		UserDaoImpl udi = new UserDaoImpl();
		CategoryDaoImpl adi = new CategoryDaoImpl();

		while (true) {

			System.out.println("====== INSURANCE MANAGEMENT SYSTEM ======");
			System.out.println("                                         ");
			System.out.println("   1. Login as ADMIN              		 ");
			System.out.println("   2. Login as USER               		 ");
			System.out.println("                                         ");
			System.out.println("=========================================");
			System.out.println("   3. Register User               		 ");
			System.out.println("   4. Forget Password             		 ");
			System.out.println("   5. Exit                        		 ");
			System.out.println("=========================================");

			System.out.println("Enter your option.");
			while (!sc.hasNextInt()) {
				System.out.println("Enter your option: 1 to 5");
				sc.nextLine();
			}
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Username:");
				String username = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();
				boolean verifyAdminUserNameAndPassword = adi.verifyAdminUserNameAndPassword(username, pass);
				if (verifyAdminUserNameAndPassword) {

					System.out.println("Valid Admin!!");
					Admin.adminLogin(); // If valid user, call UserLoginAfterPage method

				} else {
					System.out.println("Invalid Admin!!");
				}

				break;

			case 2:
				System.out.println("Enter your email address");
				String email2 = sc.next();
				System.out.println("Enter your password");
				String pass2 = sc.next();
				boolean verifyEmailAndPassword = udi.verifyEmailAndPassword(email2, pass2);

				if (verifyEmailAndPassword) {

					System.out.println("Valid User!!");
					UserLoginAfterPage.userLoginCategoryDetails(); // If valid user, call UserLoginAfterPage method

				} else {
					System.out.println("Invalid User!!");
				}

				break;

			case 3:
				udi.register();
				break;

			case 4:
				System.out.println("Enter your email address");
				String email3 = sc.next();
				String pass3 = udi.getPassword(email3);
				if (pass3 != null) {
					System.out.println("Your password is " + pass3);
				} else {
					System.out.println("Email doesn't exist.");
				}
				break;

			case 5:
				System.out.println("Thank you for using the app.");
				System.exit(choice);
				break;

			default:
				System.out.println("Invalid option selected. Enter the correct option.");
				break;
			}
		} // End of while loop.
	}
}
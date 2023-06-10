package com.ims.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.ims.model.PolicyDetails;

public class PolicyDaoImpl extends AllImplementation {

	Scanner sc = new Scanner(System.in);

	@Override
	public void addPolicy() {
		int i = 1;
		while (i == 1) {

			System.out.println("Enter the policy ID : ");
			while (!sc.hasNextInt()) {
				System.out.println("Input the policy ID number :");
				sc.nextLine();
			}
			int pID = sc.nextInt();
			System.out.println("Enter policy name (Home_Policy or Auto_Policy): ");
			String pName = sc.next();
			System.out.println("Enter insured amount : ");
			int aIns = sc.nextInt();
			System.out.println("Policy description: ");
			String pDes = sc.next();

			PolicyDetails pod = new PolicyDetails(pID, pName, aIns, pDes);

			addPolicy.add(pod);
			System.out.println("Policy registered successfully.");
			System.out.println("Do you like to add more policy? Type 1 for Yes / 2 for No");
			i = sc.nextInt();
		}
	}

	@Override
	public List<PolicyDetails> viewPolicy() {

		return addPolicy;
	}

	@Override
	public void updatePolicy(int pID) {
		int i = 0;
		for (PolicyDetails pod : addPolicy) {
			if (pod.getPolicyID() == pID) // if category ID exist
			{
				++i;
				System.out.println("What do you want to modify/update? 1. Policy Name	2. Sum-insured amount");
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter updated policy name. ");
					String pName = sc.next();
					pod.setPolicyName(pName);
					System.out.println("Policy name is updated.");

					break;

				case 2:
					System.out.println("Enter updated sum-insured amount. ");
					int sIns = sc.nextInt();
					pod.setSumInsured(sIns);
					System.out.println("Sum-insured amount is updated. ");

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
			System.out.println("The policy ID doesn't exist.");
	}

	@Override
	public void deletePolicy(int pID) {

		int i = 0;
		for (PolicyDetails pod : addPolicy) {
			if (pod.getPolicyID() == pID) {
				addPolicy.remove(pod);
				System.out.println("Policy has been deleted successfully.");
				i++;
				break;
			} // end of if loop
		} // end of for loop
		if (i == 0)
			System.out.println("The policy ID doesn't exist.");

	}

}

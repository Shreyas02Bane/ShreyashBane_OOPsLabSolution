/**
 * 
 */
package com.credentials.main;

import java.util.Scanner;

import com.credentials.credenetialsService.CredentialsService;
import com.credentials.employee.Employee;

/**
 * @author Shreyas
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		CredentialsService cds = new CredentialsService();
		
		
		
		int option;
		
		String firstName, lastName;
		
		
		
		do {
			
			System.out.println("Please Enter your First Name: ");
			firstName = sc.nextLine();
				
			System.out.println("Please Enter your Last Name: ");
			lastName = sc.nextLine();
			
			Employee emp = new Employee(firstName, lastName);
			
			System.out.println("Please Enter Corresponding Number to your Department: \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
			System.out.println("==============================================================================================================");
			option = sc.nextInt();
			
			
				
			String dept;
			
			switch(option) {
			case 0 : System.out.println("Thank you for Using our Services!"); break;
			
			case 1 : dept = "tech";
				cds.generateEmailID(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), dept);
				cds.generatePassword();
				cds.showCredentials();
				break;
			
			case 2 : dept = "admin";
				cds.generateEmailID(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), dept);
				cds.generatePassword();
				cds.showCredentials();
				break;
			
			case 3 : dept = "hr";
				cds.generateEmailID(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), dept);
				cds.generatePassword();
				cds.showCredentials();
				break;
			
			case 4 : dept = "legal";
				cds.generateEmailID(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), dept);
				cds.generatePassword();
				cds.showCredentials();
				break;
			
			default : System.out.println("Invalid Option");
			}
			
			System.out.println("==============================================================================================================");
			
			
			
		}while(option > 0 && option <= 4);
		
		sc.close();
	}

}

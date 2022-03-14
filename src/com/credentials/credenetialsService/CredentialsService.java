package com.credentials.credenetialsService;

import java.util.Random;

public class CredentialsService {
	
	String email;

	String password;
	
	StringBuilder sb = new StringBuilder();
	
	public void generatePassword() {
		
		sb.delete(0, sb.length());
		
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		      
		      
		String values = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

		
		for(int i = 0; i< 8 ; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		
		for (Object obj : password)
			sb.append(obj.toString());
		
		

		this.password = sb.substring(0, sb.length() - 1);
	}

	
	public String generateEmailID(String fName, String lName, String dept) {
		email = fName+"."+lName+"@"+dept+".greatlearning.com";
		return email;
	}
	
	public void showCredentials() {
		System.out.println("Email-Id: "+email);
		System.out.println("Password: "+password);
	}
	
}

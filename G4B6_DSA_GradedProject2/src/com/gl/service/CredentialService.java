package com.gl.service;
import com.gl.employee.Employee;
import java.util.Random;
public class CredentialService {
	
	String companyName="abc";
	
	public  String generatePassword() {
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String smallChars = "abcdefghijklmnopqrstuvwxyz";

		String digits = "0123456789";

		String speacialChars = "!@# $%^&*()_=+";

		String password = "";

		Random random = new Random();

		

		for (int i = 0; i < 2; i++) {

		password += capitalChars.charAt(random.nextInt(capitalChars.length()));

		password += smallChars.charAt(random.nextInt(smallChars.length()));

		password += digits.charAt(random.nextInt(digits.length()));

		password += speacialChars.charAt(random.nextInt(speacialChars.length()));

		}
		return password;
	   }
	public  String generateEmailAddress(Employee employee,String dept) {
		
		return employee.getFirstName().toLowerCase()+employee.getLastName()+"@"+dept + "." + companyName +".com";
		   //return companyName + "abc.com";
	   }
	public  void showCredentials(Employee employee,String dept) {
		
		   System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
	       System.out.println("Email -->" +generateEmailAddress(employee,dept));
	       System.out.println("Password -->" +generatePassword());
	}

}

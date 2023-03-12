package com.gl.main;
import java.util.Scanner;
import com.gl.employee.Employee;
import com.gl.service.CredentialService;
public class Application {
	
	String  email=null;
	String password =null;;
	public static void main(String[] args) {
		Employee employee= new Employee("Athira","Babu");
		CredentialService credential=new CredentialService();
		System.out.println("Please Enter the department from th following");
		System.out.println("1 Technical");
		System.out.println("2 Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc= new Scanner(System.in);
		
		int dept = sc.nextInt();
		
		switch(dept) {
		case 0:
			dept=0;
			Application.main(args);
			break;
		case 1:
			credential.showCredentials(employee,"tech");
			break;
		case 2:
			credential.showCredentials(employee,"adm");
			break;
		case 3:
			credential.showCredentials(employee,"hr");
			break;
			
		case 4:
			credential.showCredentials(employee,"leg");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
			
			
	    }
	 
   }
}

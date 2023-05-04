package com.Employeemanagement.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Employee.Service.ServiceImpl;

public class EmployeeController {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		boolean flag=true;
		while(flag) {
			
			ServiceImpl  service=new ServiceImpl();
					
		Scanner sc=new Scanner(System.in);
		
		System.out.println("******Welcome To Employee Management System*****");
		System.out.println("Enter your Choice");
		System.out.println("Press 1 for Create Tabale");
		System.out.println("Press 2 for Insert data");
		System.out.println("Press 3 for Read Data");
		System.out.println("Press 4 for Update Data");
		System.out.println("Press 5 for delete data");
		System.out.println("Press 6 for Delete All Data");
		System.out.println("Press 7 for EXIT");
		
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			
			service.CreateTabale();
			break;
		case 2:
			service.InsertData();
			break;
		case 3:
			service.ShowedData();
			break;
		case 4:
			service.UpdateData();
		    break;
		case 5:
			service.DeleteById();
			break;
		case 6:
			service.DeleteAll();
			break;
		case 7:
			flag=true;
			break;
		default :
				System.out.println("Invalid choice");
			break;
		
	}

}
		System.out.println("Thanks for visiting us");
}}
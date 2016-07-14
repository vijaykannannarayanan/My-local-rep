package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

public class UserInteraction {

	Scanner in = new Scanner(System.in);
	HashMap hm=new HashMap();
	
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of the Employee:");
		String name=in.next();
		
		System.out.println("Enter the Kin Id of the Employee:");
		int kin_id=in.nextInt();
		
		System.out.println("Enter the Email id of the Employee:");
		String email_id=in.next();
		
		System.out.println("Enter the Phone number of the Employee:");
		long phone_number=in.nextInt();
		
		System.out.println("Enter the Address of the Employee:");
		String address=in.next();
		
		System.out.println("Enter the Date of birth of the Employee:");
		String date_of_birth=in.next();
		
		System.out.println("Enter the Department of the Employee:");
		String department=in.next();
		
		System.out.println("Enter the Project of the Employee:");
		String project=in.next();
		
		System.out.println("Enter the Date of birth of the Employee:");
		String roles=in.next();
		hm.put(name);
	}

	public void modifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void searchEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	
		
		// TODO Auto-generated method stub
		
		
	}

	


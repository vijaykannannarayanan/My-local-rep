package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 System.out.println(" ACTIVITY MENU \n 1.Add Employee\n 2.Modify Employee\n 3.Remove Employee\n 4.Search Employee\n 5.Get All Employee");
		System.out.println("Please Enter your Activity Option");
		 Scanner in = new Scanner(System.in);
		 int c = in.nextInt();

			UserInteraction ui=new UserInteraction();
		 menuSelection(c,ui);
		 
		}
	public static void menuSelection(int c,UserInteraction ui) {
	
		
		switch (c) {
		case 1:
			ui.addEmployee();
			break;
		case 2:
			ui.modifyEmployee();
			break;
		case 3:
			ui.removeEmployee();
			break;
		case 4:
			ui.searchEmployee();
			break;
		case 5:
			ui.getAllEmployee();
			break;

		default:
			System.out.println("Please enter valid option");
			break;
		}
	}
}


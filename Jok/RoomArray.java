package com.main.Ryan;

import java.util.Scanner;

public class RoomArray {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String[] arrayRoom = new String[10];
		
		boolean askInput = true;
		
		while(askInput == true) {
			System.out.print("Enter Room Number: ");
			Scanner whichRoom = new Scanner(System.in);
			int intWhichRoom = whichRoom.nextInt();
			
			System.out.print("Enter Customer Name: ");
			Scanner whichCustomer = new Scanner(System.in);
			String strWhichCustomer = whichCustomer.nextLine();
			
			arrayRoom[intWhichRoom] = strWhichCustomer;
			
			System.out.println("Record Saved!");
			
			System.out.print("Do you want to check-in another customer? (YES / NO) ");
			Scanner stillCheckIn = new Scanner(System.in);
			String inputStillCheckIn = stillCheckIn.nextLine();
			
			System.out.println(inputStillCheckIn);
			
			if (inputStillCheckIn.equals("NO")) {
				askInput = false;
			}
			
		}
		
		for(int i=0; i < arrayRoom.length; i++) {
			if (arrayRoom[i] != null) {
				System.out.print("Room Number " + i +  " - ");
				System.out.println(arrayRoom[i]); 
			}
		} 
		
	}
}

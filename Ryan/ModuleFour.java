package com.main.Ryan;

import java.util.Scanner;

public class ModuleFour {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String[] roomNumber = new String[10];
		
		boolean recording = true;
		
		while(recording == true) {
			System.out.print("Enter Room Number: ");
			Scanner roomAccess = new Scanner(System.in);
			int roomInt = roomAccess.nextInt();
			
			System.out.print("Enter Customer Name: ");
			Scanner customerName = new Scanner(System.in);
			String cxName = customerName.nextLine();
			
			roomNumber[roomInt] = cxName;
			
			System.out.println("Record Saved!");
			
			System.out.print("Do you want to check-in another customer? (YES / NO) ");
			Scanner checkIn = new Scanner(System.in);
			String conCheckIn = checkIn.nextLine();
			
			System.out.println(conCheckIn);
			
			if (conCheckIn.equals("NO")) {
				recording = false;
			}
			
		}
		
		for(int i=0; i < roomNumber.length; i++) {
			if (roomNumber[i] != null) {
				System.out.print("Room Number " + i +  " - ");
				System.out.println(roomNumber[i]); 
			}
		} 
		
	}
}

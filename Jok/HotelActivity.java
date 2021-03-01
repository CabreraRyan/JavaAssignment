package com.main.Jok;


import java.util.Scanner;

public class HotelActivity {
	public static void main(String[] args) {
		System.out.println("Welcome to hotel transilv!");
		
		System.out.print("Enter number of floors: ");
		Scanner f = new Scanner(System.in);
		int fNum = f.nextInt();
		
		
		System.out.print("Enter number of rooms per floor: ");
		Scanner r = new Scanner(System.in);
		int rNum = r.nextInt();
		
		String[][] transilv = new String[fNum][rNum];
		
		boolean exit = false;
		
		while(exit == false) {
			System.out.println("1-Checkin 2-Checkout 3-Print 4-Exit");
			System.out.print("Enter your choice: ");
			
			Scanner c = new Scanner(System.in);
			int cInput = c.nextInt();
			
			if(cInput != 4) {
				System.out.print("Enter floor num: ");
				Scanner fInput = new Scanner(System.in);
				int intFInput = fInput.nextInt();
				
				System.out.print("Enter room num: ");
				Scanner rInput = new Scanner(System.in);
				int intRInput = rInput.nextInt();
				
				if(cInput == 1) {
					System.out.print("Enter customer name: ");
					Scanner cx = new Scanner(System.in);
					String cxInput = cx.nextLine();
					
					transilv[intFInput][intRInput] = cxInput;
					System.out.println("Saved!");		
				} else if(cInput == 2) {
					System.out.println("Customer " + transilv[intFInput][intRInput] + " Checked out!");
					transilv[intFInput][intRInput] = null;
				} else if(cInput == 3) {
					System.out.println("Floor " + intFInput + " Room " + intRInput + " - " + transilv[intFInput][intRInput]);
				}
				
			} else {
				System.out.println("Thank you!");
				exit = true;
			}
			
		}
				
	}
}

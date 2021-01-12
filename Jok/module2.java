package com.main;

import java.util.Scanner;

public class module2 {
	public static void main(String[] args) {
		System.out.print("Enter your Grade: ");
		Scanner enter = new Scanner(System.in);
		int g = enter.nextInt();
		String grade_letter = "";
		
		if (g >= 75) {
			grade_letter = "A";
		} else if (g <= 74) {
			grade_letter = "B";
		}
		
		switch(grade_letter) {
		case "A":
			System.out.println("You Passed!");
			break;
		case "B":
			System.out.println("You Failed");
			break;
		default:
			System.out.println("Invalid Grade");
			break;
		}
			
	}
}

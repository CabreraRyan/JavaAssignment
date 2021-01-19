package com.main;

import java.util.Scanner;

public class ProgramLooping {
	public static void main(String[] args) {
		System.out.print("Enter your Starting: ");
		Scanner fNumber = new Scanner(System.in);
		int firstNumber = fNumber.nextInt();
		
		System.out.print("Enter your Ending: ");
		Scanner eNumber = new Scanner(System.in);
		int endingNumber = eNumber.nextInt();
		
		while ((endingNumber+1)!=firstNumber) {
			System.out.print(firstNumber);
			firstNumber++;
		}
		
	}
}

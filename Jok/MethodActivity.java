package com.main.Jok;

import java.util.Scanner;

public class MethodActivity {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			enterTemperature();
			Scanner tInput = new Scanner(System.in);
			int IntT = tInput.nextInt();
			System.out.println(tempCheck(IntT));
			
		}
	}
	
	public static String tempCheck(int t) {
		if(t >= 25) {
			return("Hot");
		} else {
			return("Cold");
		}
	}
	
	public static void enterTemperature() {
		System.out.print("Enter your temperature: ");
	}
	
}

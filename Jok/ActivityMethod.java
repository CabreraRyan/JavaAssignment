package com.main.Jok;

import java.util.Scanner;

public class ActivityMethod {
	public static void main(String[] args) {
		
		System.out.print("How many temperature check: ");
		Scanner hInput = new Scanner(System.in);
		int hInt = hInput.nextInt();		
		
		for(int i=0; i<hInt; i++) {
			System.out.print(enterTemperature());
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
	
	public static String enterTemperature() {
		return("Enter your temperature: ");
	}
	
}

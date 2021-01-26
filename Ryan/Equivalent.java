package com.main.Ryan;

import java.util.Scanner;

public class Equivalent {
	public static void main(String[] args) {
		System.out.print("How many grades to check the equivalent? ");
		Scanner howMany = new Scanner(System.in);
		int Hmany = howMany.nextInt();
		
		for(int i=0; i<Hmany; i++) {
			System.out.print("Enter Grade #" + (i+1) + " ");
			Scanner h = new Scanner(System.in);
			double h2 = h.nextDouble();
			double equivalent = 0;
			
			if(h2 >= 96) {
				equivalent = 1;
			} else if (h2 >= 91.5 && h2 <= 95.9) {
				equivalent = 1.25;
			} else if (h2 >= 87.0 && h2 <= 91.4) {
				equivalent = 1.50;
			} else if (h2 >= 82.5 && h2 <= 86.9) {
				equivalent = 1.75;
			} else if (h2 >= 78 && h2 <= 82.4) {
				equivalent = 2;
			} else if (h2 >= 73.5 && h2 <= 77.9) {
				equivalent = 2.25;
			} else if (h2 <= 73.4) {
				equivalent = 5;
			}
			
			System.out.println("It's " + equivalent);
			
		}
		
		System.out.println("Thank you!");
		
	}
}

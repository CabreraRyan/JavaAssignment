package com.main.Ryan;

import java.util.Scanner;

public class EquivalentActivity {
	public static void main(String[] args) {
		System.out.print("How many grades to check the equivalent? ");
		Scanner x = new Scanner(System.in);
		int gradeCheck = x.nextInt();
		
		for(int i=0; i<gradeCheck; i++) {
			System.out.print("Enter Grade #" + (i+1) + " ");
			Scanner inputGrade = new Scanner(System.in);
			double grade = inputGrade.nextDouble();
			double transmutedGrade = 0;
			
			if(grade >= 96) {
				transmutedGrade = 1;
			} else if (grade >= 91.5 && grade <= 95.9) {
				transmutedGrade = 1.25;
			} else if (grade >= 87.0 && grade <= 91.4) {
				transmutedGrade = 1.50;
			} else if (grade >= 82.5 && grade <= 86.9) {
				transmutedGrade = 1.75;
			} else if (grade >= 78 && grade <= 82.4) {
				transmutedGrade = 2;
			} else if (grade >= 73.5 && grade <= 77.9) {
				transmutedGrade = 2.25;
			} else if (grade <= 73.4) {
				transmutedGrade = 5;
			}
			
			System.out.println("It's " + transmutedGrade);
			
		}
		
		System.out.println("Thank you!");
		
	}
}

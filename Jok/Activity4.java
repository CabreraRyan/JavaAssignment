package com.main.Ryan;

import java.util.Scanner;

public class Activity4 {
	public static void main(String[] args) {
		System.out.print("How many grades to check the equivalent? ");
		Scanner mGrade = new Scanner(System.in);
		int gradeCheckCount = mGrade.nextInt();
		
		for(int i=0; i<gradeCheckCount; i++) {
			System.out.print("Enter Grade #" + (i+1) + " ");
			Scanner gradeInputted = new Scanner(System.in);
			double gradeVar = gradeInputted.nextDouble();
			double convertedGrade = 0;
			
			if(gradeVar >= 96) {
				convertedGrade = 1;
			} else if (gradeVar >= 91.5 && gradeVar <= 95.9) {
				convertedGrade = 1.25;
			} else if (gradeVar >= 87.0 && gradeVar <= 91.4) {
				convertedGrade = 1.50;
			} else if (gradeVar >= 82.5 && gradeVar <= 86.9) {
				convertedGrade = 1.75;
			} else if (gradeVar >= 78 && gradeVar <= 82.4) {
				convertedGrade = 2;
			} else if (gradeVar >= 73.5 && gradeVar <= 77.9) {
				convertedGrade = 2.25;
			} else if (gradeVar <= 73.4) {
				convertedGrade = 5;
			}
			
			System.out.println("It's " + convertedGrade);
			
		}
		
		System.out.println("Thank you!");
		
	}
}

package com.main;

public class fProg {
	public static void main(String[] args) {
		int score = 5;
		if (score >= 95) {
			System.out.println("You have earned A");
		} else if (score >= 90){
			System.out.println("You have earned B");
		} else if (score >= 85) {
			System.out.println("You have earned C");
		} else {
			System.out.println("You have earned D");
		}
	}
}

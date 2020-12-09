package com.main;

import java.util.Random;

public class FirstProgram {
	public static void main(String[] args) {
		Random rand = new Random();
		int secretNum = rand.nextInt(10);
		if(secretNum > 5) {
			System.out.println("The secret number is greater than 5");
		} else {
		System.out.println("The secret number is equal or less than 5");
		}
	}
}

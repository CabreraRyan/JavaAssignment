package com.main;

import java.util.Scanner;

public class LoopProg {
	public static void main(String[] args) {
		System.out.print("Enter your Starting: ");
		Scanner first = new Scanner(System.in);
		int f = first.nextInt();
		
		System.out.print("Enter your Ending: ");
		Scanner end = new Scanner(System.in);
		int e = end.nextInt();
		
		while ((e+1)>f) {
			System.out.print(f);
			f++;
		}
		
	}
}

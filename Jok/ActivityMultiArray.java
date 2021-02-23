package com.main.Ryan;

import java.util.Scanner;

public class ActivityMultiArray {
	public static void main(String[] args) {
		char[][] multiArray = {
				{'a', 'g', 'm'},
				{'b', 'h', 'n'},
				{'c', 'i', 'o'},
				{'d', 'j', 'p'},
				{'e', 'k', 'q'},
				{'f', 'l', 'r'}
		};
		
		System.out.println("Last character: " + multiArray[5][2]);
		
		System.out.println("First Column:");
		int col = 0;
		while(col < multiArray.length) {
			System.out.print(multiArray[col][0] + " ");
			col++;
		}
		
		System.out.println(" ");
		System.out.println("First Row: ");
		
		for(int row = 0; row < multiArray[0].length; row++) {
			System.out.print(multiArray[0][row] + " ");
		}
		
	}
}

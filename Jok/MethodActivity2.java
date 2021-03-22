package com.main.Jok;

public class MethodActivity2 {
	
	public static String inputHobby = "Programming"; 
	public static int inputAge = 18;
	public static String inputName = "Ryan";
	public static String temp;
	
	public static void main(String[] args) {
		printData(inputHobby, inputName, inputAge);		
	}
	
	
	static void printData(String x, int age, String y) {
		
		if (x == inputHobby){
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print("My name is " + x + ", My age is " + age + " and my hobby is " + y);
	}
	
	static void printData(int age, String x, String y) {
		
		if (x == inputHobby){
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print("My name is " + x + ", My age is " + age + " and my hobby is " + y);
	}
	
	static void printData(String x, String y, int age) {
		
		if (x == inputHobby){
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.print("My name is " + x + ", My age is " + age + " and my hobby is " + y);
	}
}

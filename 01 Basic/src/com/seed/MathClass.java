package com.seed;

public class MathClass {
	
	public static final double PI = 3.14159;
	
	public static void add(int x, int y) {
		System.out.println("Addition of " + x + " and " + y + " is " + (x+y));
	}
	
	public static void sub(int x, int y) {
		System.out.println("Subtraction of " + x + " and " + y + " is " + (x-y));
	}
	
	public static void mul(int x, int y) {
		System.out.println("Multiplication of " + x + " and " + y + " is " + (x*y));
	}
	
	public static void div(double x, double y) {
		System.out.println("Division of " + x + " and " + y + " is " + (x/y));
	}
	
	public static void add(String s1, String s2) {
		System.out.println("String concatenation : " + (s1+s2));
	}
}














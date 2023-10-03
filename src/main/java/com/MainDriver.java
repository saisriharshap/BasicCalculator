package com;

public class MainDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition of 5 and 5 is " + c.add(5, 5));
		System.out.println("Subtraction of 5 and 5 is " + c.subtract(5, 5));
		System.out.println("Multiplication of 5 and 5 is " + c.multiply(5, 5));
		System.out.println("Division of 5 and 5 is " + c.divide(5, 5));
	}
}

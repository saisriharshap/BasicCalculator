package com;

public class Calculator {

	public Calculator() {
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public long multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if(b == 0)
			throw new IllegalArgumentException("Division with zero is not acceptable");
		return Double.valueOf(a) / Double.valueOf(b);
	}
}

package com.bridhelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		LengthCalculate();
	}

	public static void LengthCalculate() {
		System.out.println("Enter the x1 co-ordinate");
		int x1 = scanner.nextInt();
		System.out.println("Enter the x2 co-ordinate");
		int x2 = scanner.nextInt();
		System.out.println("Enter the y1 co-ordinate");
		int y1 = scanner.nextInt();
		System.out.println("Enter the y2 co-ordinate");
		int y2 = scanner.nextInt();

		double length = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		System.out.println("The length of line is " + length);
	}
}

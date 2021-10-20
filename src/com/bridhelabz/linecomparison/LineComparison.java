package com.bridhelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		LengthCalculate();
		toCheckEquality();
		toCheckGreaterOrLess();
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
	}

	public static void toCheckEquality() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = s.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = s.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = s.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = s.nextInt();

		System.out.println("Enter x co-ordinate of third point: ");
		int p1 = s.nextInt();
		System.out.println("Enter y co-ordinate of third point: ");
		int q1 = s.nextInt();
		System.out.println("Enter x co-ordinate of forth point: ");
		int p2 = s.nextInt();
		System.out.println("Enter y co-ordinate of forth point: ");
		int q2 = s.nextInt();
		s.close();
	}

	public static void toCheckGreaterOrLess() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = s.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = s.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = s.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = s.nextInt();

		System.out.println("Enter x co-ordinate of third point: ");
		int p1 = s.nextInt();
		System.out.println("Enter y co-ordinate of third point: ");
		int q1 = s.nextInt();
		System.out.println("Enter x co-ordinate of forth point: ");
		int p2 = s.nextInt();
		System.out.println("Enter y co-ordinate of forth point: ");
		int q2 = s.nextInt();
		s.close();

		Double length_of_line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double length_of_line2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

		System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
		System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
		boolean ans = length_of_line1.equals(length_of_line2);
		if (ans)
			System.out.println("Both lines are equal.");
		else
			System.out.println("Both lines are not equal.");
	}

}

package com.java.cal;

import java.util.Scanner;

public class Calculator {
	
	// break loop , exit program, return method

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		while (choice != 5) {
			System.out.println("==welcome to calculator==");

			System.out.println("1.addition");

			System.out.println("2.substraction");

			System.out.println("3.multiplication");

			System.out.println("4.division");
			System.out.println("5. Exit ");

			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			
			int a, b;
			switch (choice) {

			case 1:
				// addition
				System.out.println("Enter the first Number");
				a = sc.nextInt();
				System.out.println("Enter the second Number");
				b = sc.nextInt();
				System.out.println(add(a, b));
				break;
			case 2:
				// sub
				System.out.println("Enter the first Number");
				a = sc.nextInt();
				System.out.println("Enter the second Number");
				b = sc.nextInt();
				System.out.println(sub(a, b));
				break;
			case 3:
				// mul
				System.out.println("Enter the first Number");
				a = sc.nextInt();
				System.out.println("Enter the second Number");
				b = sc.nextInt();
				System.out.println(mul(a, b));
				break;
			case 4:
				// div
				System.out.println("Enter the first Number");
				a = sc.nextInt();
				System.out.println("Enter the second Number");
				b = sc.nextInt();
				if (b <= 0) {
					System.out.println("division is not possibe");// a/b=>10/0
					break;
				}

				System.out.println(division(a, b));
				break;
			case 5:
				// exit
				System.out.println("Thnk You for using it !!");
				System.exit(0);
			default:
				System.out.println("=====Enter the correct choice===");
			}

		}

//		// add , mul ,sub, div	
//		System.out.println(add(2,4));
//		System.out.println(sub(4,2));
//		System.out.println(mul(2,4));
//		System.out.println(division(4, 0));
//		add(2,4);
	}
//	add => a, b => res

	public static int add(int a, int b) {

		int res = 0;

		res = a + b;

		return res;

	}

	// sub => a,b => res
	public static int sub(int a, int b) {
		int res = 0;

		res = a - b;

		return res;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	// div => a, b=>res
	public static int division(int a, int b) {
		return a / b;
	}

}

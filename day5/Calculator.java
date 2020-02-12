package weekday.day5;

import java.util.Scanner;

public class Calculator {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void add(double a, int b) {

		System.out.println(a + b);
	}

	public void add(int a, int b,int c) {

		System.out.println(a + b + c);
	}

	public void add(int a, double b) {

		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("enter first number"); int num1 = scan.nextInt();
		 * System.out.println("enter second number"); int num2 = scan.nextInt();
		 * 
		 * calc.add(num1, num2);
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string1");
		String str = scan.next();
		System.out.println(str);

		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter string2");
		String str1 = scan1.nextLine();
		System.out.println(str1);

	}

}

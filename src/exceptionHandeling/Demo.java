package exceptionHandeling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
//		try {
//		// we write a line of code that may throw exception
//		}
			
		Scanner sc = new Scanner(System.in);
		
		while (true) {
						
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			try {
				int division = a / b;
				System.out.println(division);
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Warning!! Value of b can not be zero");
			}
			int sum = a + b;
			System.out.println(sum);
			
		}

	}

}

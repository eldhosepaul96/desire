package common;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int a;
		Scanner obj = new Scanner(System.in);
		String x = "y";
		try {
		while (x.equalsIgnoreCase("y")) {
			System.out.println("Enter a number");
			a = obj.nextInt();
			boolean flag = false;
			if (a > 1) {
				for (int i = 2; i < a; i++) {
					if (a % i == 0) {
						flag = true;
						break;
					}
				}
			}
			if (flag)
				System.out.println(a + " is not a prime number");
			else
				System.out.println(a + " is a prime number");
			System.out.println("Press y to continue");
			x = obj.next();
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

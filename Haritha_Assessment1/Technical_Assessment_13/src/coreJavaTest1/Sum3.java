package coreJavaTest1;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			sum += i;
		}
		if (sum == num) {
			System.out.println(num + " is perfect number.");
		} else {
			System.out.println(num + " is not an perfect number.");
		}

		input.close();

	}

}

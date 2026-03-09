package coreJavaTest1;

import java.util.Scanner;

public class Sum4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the starting value:");
		int start = input.nextInt();
		System.out.println("enter the ending value:");
		int end = input.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 10 == 0) {
				System.out.println("dong");
			} else if (i % 5 == 0) {
				System.out.println("ding");
			} else {
				System.out.println(i + " ");
			}
		}

		input.close();
	}
}

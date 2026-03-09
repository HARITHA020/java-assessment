package coreJavaTest1;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 1000 && arr[i] <= 9999) {
				int sum = 0, num = arr[i];
				while (num > 0) {
					sum += num % 10;
					num /= 10;
				}
				while (sum > 9) {
					int temp = sum;
					sum = 0;
					while (temp > 0) {
						sum += temp % 10;
						temp /= 10;
					}
				}
				if (sum == 7) {
					System.out.println("First Prize is to token:" + arr[i]);
				} else if (sum == 5) {
					System.out.println("Second Prize is to token:" + arr[i]);
				} else if (sum == 3) {
					System.out.println("Third Prize is to token:" + arr[i]);
				}
			} else {
				System.out.println("Invalid input.");
			}
		}
		input.close();
	}
}

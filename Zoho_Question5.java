package arrayafter;

import java.util.Scanner;

public class Zoho_Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();

		oddPrimeNumberPrint(no);

	}

	private static void oddPrimeNumberPrint(int no) {
		// TODO Auto-generated method stub

		int temp = 2;
		for (int i = 2; i <= no; i++) {
			if (prime(i) == 1) {
				if (temp % 2 != 0) {
					System.out.println(i + " ");

				}
				temp++;
			}

		}

	}

	private static int prime(int no) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int j = 1; j <= no; j++) {
			if (no % j == 0)
				count++;
		}
		if (count == 2) {

			return 1;

		}

		return 0;
	}

}

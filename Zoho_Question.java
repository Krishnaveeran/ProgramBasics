package arrayafter;

import java.util.Scanner;

public class Zoho_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] ar = new int[size];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int j = 1;
		for (int i = ar.length - 1; i >= 0; i--) {

			if (ar[i] != 0) {
				ar[ar.length - j] = ar[i];

				j++;
			}
		}

		for (int i = 0; i < ar.length - (j - 1); i++) {
			ar[i] = 0;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}

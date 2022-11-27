package arrayafter;

import java.util.Scanner;

import java.util.Scanner;

public class Zoho_Question4 {

	public static void main(String[] args) {
		
	
//		water
//		w   w   w 
//		  a a a   
//		w a t e r 
//		  e e e   
//		r   r   r 
//		
	
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {

			for (int j = 0; j < input.length(); j++) {
				if (j == i || i == input.length() / 2)
					System.out.print(input.charAt(j) + " ");

				else if (i == input.length() - 1 - j || j == input.length() / 2)
					System.out.print(input.charAt(i) + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}

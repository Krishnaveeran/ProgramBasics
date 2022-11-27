package arrayafter;

import java.util.Scanner;

public class Zoho_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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

			if (input.charAt(i) == 'w' || input.charAt(i) == 'r') {
				for (int j = 0; j < input.length(); j += 2) {
					System.out.print(input.charAt(i) + "   ");
				}
				System.out.println();
				continue;
			}

			if (input.charAt(i) == 'a' || input.charAt(i) == 'e') {
				for (int j = 0; j < input.length(); j++) {
					if (j != 0 & j != 4)
						System.out.print(input.charAt(i) + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
				continue;
			}

			if (input.charAt(i) == 't') {
				for (int j = 0; j < input.length(); j++) {
					System.out.print(input.charAt(j) + " ");
				}
				System.out.println();
				continue;
			}

		}

	}

}

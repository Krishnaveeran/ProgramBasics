package arrayafter;

import java.util.Scanner;

public class OwnExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OwnExceptionDemo oed = new OwnExceptionDemo();
		try {
			oed.display();

		} catch (OwnException oe) {

		}
	}

	private void display() throws OwnException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = sc.nextInt();

		if (age < 18) {
			throw new OwnException("You are not eligible for voting");
		}

	}

}

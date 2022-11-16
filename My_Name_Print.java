package arrayafter;

public class My_Name_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My_Name_Print mnp = new My_Name_Print();

		mnp.letter_K();
		System.out.println("\n");
		mnp.letter_R();
		System.out.println("\n");
		mnp.letter_I();
		System.out.println("\n");
		mnp.letter_S();
		System.out.println("\n");
		mnp.letter_H();
		System.out.println("\n");
		mnp.letter_N();
		System.out.println("\n");
		mnp.letter_A();
	}

	private void letter_A() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (j == 1 || j == 5 || i == 3 || i==1)
					System.out.print("@ ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
	}

	private void letter_N() {
		// TODO Auto-generated method stub
	
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j==1|| j == i || j == 5)
					System.out.print("@ ");
				else
					System.out.print("  ");
			
			}
			System.out.println(); 

		}

	}

	private void letter_H() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (j == 1 || j == 5 || i == 3)
					System.out.print("@ ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}

	private void letter_S() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || i == 3 || (i == 2 && j == 1) || (i == 4 && j == 5))
					System.out.print("@ ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}

	private void letter_I() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 3)
					System.out.print("@ ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}

	private void letter_R() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= 5) {
					if (i == 1 || i == 5)
						System.out.print("@ ");
					else if (j == 1 || j == 5)
						System.out.print("@ ");
					else
						System.out.print("  ");
				}

			}

			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if ((j == 1 || j == i))
					System.out.print("@ ");

				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	private void letter_K() {
		// TODO Auto-generated method stub

		for (int i = 5; i > 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("@ ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("@ ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

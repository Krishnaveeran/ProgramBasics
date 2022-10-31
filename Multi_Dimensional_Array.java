package arrayafter;
import java.util.Scanner;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_Dimensional_Array mda = new Multi_Dimensional_Array();
//		mda.printing_two_dimensional_array();
//		mda.print_all_the_element_in_two_dimensional_array();
//		mda_print_two_d_array_in_tabular_format();
//		mda.print_all_the_three_dimensional_array();
//		mda.direct_method_of_declaration();
//		mda.two_dimension_array_addition();
//		mda.print_three_dimensions_array_in_tabular_format();
//		mda.size_of_an_array();
//		mda.matrix_addition();
//		mda.jagged_array();
//		mda.jagged_array1();
//		mda.program_to_demonstrate_2_d_jagged_array_in_Java();
//		mda.program_to_demonstrate_2_d_jagged_array_in_Java1();
//		mda.program_to_demonstrate_2_d_jagged_array_in_Java2();
	}

	/*
	private void program_to_demonstrate_2_d_jagged_array_in_Java2() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern row size: ");
		int number = sc.nextInt();

		int[][] pa = new int[number][];
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new int[i + 1];
		}
		for (int i = 0; i < pa.length; i++) {
			for (int j = 0; j < pa[i].length; j++) {

				System.out.print("*" + "   ");
			}
			System.out.println();
		}
	}
}

	*/
	
	/*	
	private void program_to_demonstrate_2_d_jagged_array_in_Java1() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pattern row size: ");
		int number=sc.nextInt();
		
		int[][] pa = new int[number][];
	for(int i=0; i<pa.length; i++)
	{
		pa[i] = new int[pa.length-i];
	}
//		pa[0] = new int[5];
//		pa[1] = new int[4];
//		pa[2] = new int[3];
//		pa[3] = new int[2];
//		pa[4] = new int[1];

		int count = pa.length;
		for (int i = 0; i < pa.length; i++) {
			for (int j = 0; j < pa[i].package arrayafter;
length; j++) {

				System.out.print("*" + "   ");
				count--;
			}
			System.out.println(); count=pa.length;
		}
	}
}
*/


/*	
	private void program_to_demonstrate_2_d_jagged_array_in_Java() {
		// TODO Auto-generated method stub
		int[][] pa = new int[5][];

		pa[0] = new int[1];
		pa[1] = new int[2];
		pa[2] = new int[3];
		pa[3] = new int[4];
		pa[4] = new int[5];

		int count = 1;
		for (int i = 0; i < pa.length; i++) {
			for (int j = 0; j < pa[i].length; j++) {

				System.out.print(count + "   ");
				count++;
			}
			System.out.println(); count=1;
		}
	}
}
*/

	
/*	private void jagged_array1() {
		// TODO Auto-generated method stub

		int[][] marks = { { 86, 45 }, { 23, 56, 35 } };
		System.out.println("marks[0] length " + marks[0].length);
		System.out.println("marks[1] length " + marks[1].length);
		int i=0;
		for(int j=0; j<marks[0].length; j++)
		{
		System.out.print(marks[i][j]+" ");
		} i++;
		
		System.out.println();
		for(int j=0; j<marks[1].length; j++)
		{
		System.out.print(marks[i][j]+" ");
		}  */
		
		/*		
		for(int i=0; i<marks[0].length; i++)
		{
		for(int j=0; j<marks[i].length; j++)
		{
		System.out.print(marks[i][j]+" ");
		} System.out.println();
		
		}
		*/
		
/*		
		for (int i = 1; i < marks[0].length; i++) {
			for (int j = 0; j < marks[1].length; j++) {		
					System.out.print(marks[i][j] + " ");
					
				}System.out.println();
			}
		
			
		}

	}
*/



	/*	
	private void jagged_array() {
		// TODO Auto-generated method stub

		int[][] ar = new int[2][0];

		ar[0] = new int[3];
		ar[1] = new int[6];
		System.out.println("ar[0] length "+ar[0].length);
		System.out.println("ar[1] length "+ar[1].length);
	}
}	

*/
	
	
	/*
	private void matrix_addition() {
		// TODO Auto-generated method stub
		int[][] ar = { { -1, -2 }, { -3, -4 } };
		int[][] br = { { 2, 4 }, { 6, 8 } };
		int[][] cr = new int[ar[0].length][br[0].length];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				cr[i][j] = ar[i][j] + br[i][j];
				System.out.print(cr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(cr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
*/


	/*
	private void size_of_an_array() {
		// TODO Auto-generated method stub

		int[][] marks = new int[3][4];
		System.out.println(marks.length);

		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length);
	}
}

*/

/*
	private static void mda.print_three_dimensions_array_in_tabular_format() {
		// TODO Auto-generated method stub
		int[][][] ar = { { { 1, 2 }, { 3, 4 }}, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					System.out.print(ar[i][j][k]+" ");
				}System.out.println();
			}System.out.println();
		}

	}
}
	*/
	
	/*	
	private void two_dimension_array_addition() {
		// TODO Auto-generated method stub
		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] br = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((ar[i][j] * br[i][j]) + "   ");
			}
			System.out.println("\n");
		}
	}
}	
*/	
	
	
	/*
	private void direct_method_of_declaration() {
		// TODO Auto-generated method stub

		int[][][] ar = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					System.out.println("ar[" + i + "][" + j + "][" + k + "] = "+ar[i][j][k]);
				}
			}
		}

	}
}

*/
	
	
	
/*	
	private void print_all_the_three_dimensional_array() {
		// TODO Auto-generated method stub

		int[][][] ar = new int[2][2][2];
		ar[0][0][0] = 15;
		System.out.println("ar[0][0][0]=" + ar[0][0][0]);

	}
}
	*/
	
	
	/*
	private static void mda_print_two_d_array_in_tabular_format() {
		// TODO Auto-generated method stub
		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		
		System.out.println("1st Array length "+ar[0].length);
		System.out.println("2nd Array length "+ar[1].length);
		System.out.println("3rd Array length "+ar[2].length);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
*/



/*
	private void print_all_the_element_in_two_dimensional_array() {
		// TODO Auto-generated method stub
		int[][] ar = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("ar[" + i + "][" + j + "] = " + ar[i][j]);
			}
		}
	}
}
*/



/*
	private void printing_two_dimensional_array() {
		// TODO Auto-generated method stub

		int[][] ar = new int[2][2];

		ar[0][0] = 1;

		System.out.print(ar[0][0] + " ");
	}
}
*/
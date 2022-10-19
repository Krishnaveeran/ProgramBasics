package programmBasics;

public class Passing_Arrays_To_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] intArray= {85,68,96,97,97};
			int[] intArray2= {174,156,199,196,189,182};
			sum(intArray);
			sum1(intArray2);
			
	}

	private static void sum1(int[] intArray2) {
		// TODO Auto-generated method stub
		int total1=0;
		for(int i=0; i<intArray2.length; i++)
			total1+=intArray2[i];
		System.out.println("My HSC Mark is "+ total1);
		System.out.println("My HSC Percentage is "+ ((total1*100)/1200));
		}


	private static void sum(int[] intArray) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0; i<intArray.length; i++)
			total+=intArray[i];
		System.out.println("My SSLC Mark is "+ total);
		}

}

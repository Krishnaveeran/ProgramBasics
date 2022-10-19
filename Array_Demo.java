package programmBasics;

public class Array_Demo {
	
	public static void main(String[] args) {
		
		Array_Demo ad=new Array_Demo();
		ad.declaration_initialization();
		ad.default_array_values_in_java();
		ad.array_literal();
		ad.accessing_java_array_elements_using_for_Loop();
		ad.what_happens_if_we_try_to_access_elements_outside_the_array_size();
		}

	private void what_happens_if_we_try_to_access_elements_outside_the_array_size() {
		// TODO Auto-generated method stub
		
		int[] arr = new int[2]; 
		arr[0] = 10; 
		arr[1] = 20; 

      		System.out.println(arr[2]); 
      //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
      	//	at programmBasics/programmBasics.Array_Demo.what_happens_if_we_try_to_access_elements_outside_the_array_size(Array_Demo.java:22)
      		// at programmBasics/programmBasics.Array_Demo.main(Array_Demo.java:12)		
      		
	}

	private void accessing_java_array_elements_using_for_Loop() {
		// TODO Auto-generated method stub
		int intArray[]={ 1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<intArray.length; i++)
		{
		System.out.println(i+" th index is "+intArray[i]);	
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	private void array_literal() {
		// TODO Auto-generated method stub
//		int intArray[]=new int[] { 1,2,3,4,5,6,7,8,9,10}; latest version of java not required this syntax
		int intArray[]={ 1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("0th Index value "+intArray[0]);
		System.out.println("5th Index value "+intArray[5]);
		System.out.println("6th Index value "+intArray[6]);
		System.out.println("9th Index value "+intArray[9]);
		System.out.println("Memory Address" +intArray);
		
		System.out.println();
		System.out.println();
	}

	
	private void default_array_values_in_java() {
		// TODO Auto-generated method stub
		
		short[] anArrayOfShort=new short[1];
		int[] anArrayOfInt=new int[1];
		long[] anArrayOfLong=new long[1];
		float[] anArrayOfFloat=new float[1];
		double[] anArrayOfDouble=new double[1];
		char[] anArrayOfChar=new char[1];
		boolean[] anArrayOfBoolean=new  boolean[1];
		String[] anArrayOfString=new String[1];
		
		System.out.println("Short Default value "+ anArrayOfShort[0]);
		System.out.println("Int Default value "+anArrayOfInt[0]);
		System.out.println("Long Default value "+anArrayOfLong[0]);
		System.out.println("FLoat Default value "+anArrayOfFloat[0]);
		System.out.println("Double Default value "+anArrayOfDouble[0]);
		System.out.println("Char Default value "+anArrayOfChar[0]);
		System.out.println("Boolean Default value "+anArrayOfBoolean[0]);
		System.out.println("String Default value "+anArrayOfString[0]);
		
		System.out.println();
		System.out.println();
	
	}

	
	
	private void declaration_initialization() {
		// TODO Auto-generated method stub
		
		
		int[] anArray; //Declare an array of integer
		anArray=new int[10];  // allocate memory for 10 integers 
		anArray[0]=89;
		anArray[1]=78;
		anArray[2]=98;
		anArray[4]=56;
	System.out.println("Element at Index 0 is: "+ anArray[0]);
	System.out.println("Element at Index 1 is: "+ anArray[1]);
	System.out.println("Element at Index 2 is: "+ anArray[2]);
	System.out.println("Element at Index 3 is: "+ anArray[3]);
	System.out.println("Element at Index 4 is: "+ anArray[4]);
	System.out.println("Memory address "+ anArray);
	System.out.println("Element at Index 4 is: "+ anArray[9]);
	System.out.println("Length of ann array "+ anArray.length);
	
	System.out.println();
	System.out.println();
	}
	

}

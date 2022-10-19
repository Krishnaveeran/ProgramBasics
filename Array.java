package programmBasics;

public class Array {
	
public static void main(String[] args) {

	double[] doubleArray= {45.80, 56.33, 45.15, 87.34, 99.01};
	
	for(int i=0; i<doubleArray.length; i++)
	{
		System.out.println("Mark "+(i+1)+" is "+doubleArray[i]);
	}
	System.out.println();
	
	
	double total=0;
	for(int i=0; i<doubleArray.length; i++)
	{
		total+=doubleArray[i];
	}
	System.out.println("The total of the mark is "+total);
	System.out.println("The percentage of the mark is "+(total/5)+"%");

	double max=doubleArray[0];
	for(int i=1; i<doubleArray.length; i++)
	{
	if(doubleArray[i]>max)
		max=doubleArray[i];
	}
	System.out.println("The maximum mark is "+ max);
	
	double min=doubleArray[0];
	for(int i=1; i<doubleArray.length; i++)
	{
	if(doubleArray[i]<min)
		min=doubleArray[i];
	}
	System.out.println("The minimum mark is "+ min);
	System.out.println();
	
	
	//for each loop 
	System.out.println("for each loop ");
	for(double elements:doubleArray)
	{
	
		System.out.println(elements);
	}
	
	
}
}












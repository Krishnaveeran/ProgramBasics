package arrayafter;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.display1();
	}

	private void display1() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number ");
		try
		{
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println(no1/no2);
		
		int []ar=new int[no1];
		System.out.println(ar[6]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check no2 "); 
			display1();
		}
		catch (InputMismatchException ime)
		{
			System.out.println("check inputs "); 
		}
		catch (ArrayIndexOutOfBoundsException ime)
		{
			System.out.println("check array length "); 
		}
		catch(Exception ae)
		{
			System.out.println("Something went wrong");
		}
		System.out.println("out of catch block");
	}

}

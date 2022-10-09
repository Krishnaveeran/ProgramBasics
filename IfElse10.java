package programmBasics;

import java.util.Scanner;

public class IfElse10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=sc.nextInt();
		
		if(num1%num2==0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}
	}


package programmBasics;
//import java.util.Scanner;
public class IfElse9 {
	
    public static void main(String s[])
    {
    	 int marks = 80;

         if( marks >=90 )
         {
             System.out.println("Distinction");
             System.out.println("Congratulations");
         }
         else if( marks > 35 )
         {
             System.out.println("Pass");
         }
         else
         {
             System.out.println("Fail");
             System.out.println("Better luck next time");
         }
    }
}
//	public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the number");
//	int num=sc.nextInt();
//	if(num%2==0)
//	{
//		System.out.println("This is even number");
//	}
//	else
//	{
//		System.out.println("This is odd number");
//	}

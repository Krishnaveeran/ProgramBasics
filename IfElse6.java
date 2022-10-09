package programmBasics;
import java.util.Scanner;
public class IfElse6 {
			 public static void main(String[] args) {
			  int year;
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter The Year");
			  year=sc.nextInt();
			   if(year%4==0)
			   {
				   if(year%100==0)
				   {
					   if(year%400==0)
					   {
						   System.out.println("This is leap year");
					   }
					   else
					   {
						   System.out.println("Not leap year");
					   }
					   
				   }
				   else
				   {
					   System.out.println("This is leap year");
					   
				   }
				   
			   }
			   else
			   {
				   System.out.println("This is not leap year");
			   }
}
}
package programmBasics;
import java.util.Scanner;
public class IfElse8 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Tamil mark");
			int tamilmark=sc.nextInt();
			System.out.println("Enter the English mark");
			int englishmark=sc.nextInt();
			System.out.println("Enter the Mathematics mark");
			int mathsmark=sc.nextInt();
			System.out.println("Enter the Science mark");
			int sciencemark=sc.nextInt();
			System.out.println("Enter the Social science mark");
			int Socialmark=sc.nextInt();
			float sum= tamilmark+englishmark+mathsmark+sciencemark+Socialmark;
			System.out.println(sum);
			float per=(sum/5f);
			System.out.println("Percentage "+per+"%");
			if (per >= 80)
			{
				System.out.println("A Grade");
			}
			else
			{
				System.out.println("B grade");
			}
		}
		
		
}

package programmBasics;

public class IfElse7 {
public static void main(String[] args) {
	int a=10;
	if(a>10) {
		System.out.println("Print this if a greater than 10");
	}
	else if (a>12) {
		System.out.println("Print this if a greater than 12");
	}
	else if(a<6)
	{
		System.out.println("Print this if a lesser than 6");
	}
	else if (a==10) {
		System.out.println("Print a =10");
	}
	else
	{
		System.out.println("if all above condition not satisfies print this statement");
	}
	
	int b=20;
	System.out.println(b>=20 ? "Pass": "Fail");
	System.out.println(b>=35 ? "pass":"fail");
}

}

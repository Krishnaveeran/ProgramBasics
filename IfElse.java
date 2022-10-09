package programmBasics;

public class ifElse {
	public static void main(String[] args) {
		ifElse ie=new ifElse();
		ie.checkOddEven(5789);
	}

	public void checkOddEven(int a) {
		// TODO Auto-generated method stub
		if(a%2==0)
		{
			System.out.println("This is Even number");
		}
		else
		{
			System.out.println("This is odd number");
		}
	}
	
}

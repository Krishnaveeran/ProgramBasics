package programmBasics;

public class Reverse {
public static void main(String[] args) {
	Reverse re=new Reverse();
//    re.reverse_Number(1234);
//    re.count_Number(12345678);
//	  re.sum_of_Digits(7568776);
//	  re.reversing_number(2343);
//	  re.palindrome(1234621);
//	  re.perfect_Number(496);
//	  re.Armstrong_Number(408);
	  re.Neon_Number(0);
}

private void Neon_Number(int no) {
	// TODO Auto-generated method stub
	int sq=no*no, sum=0,r;
	while(sq>0)
	{
		r=sq%10;
		sum=sum+r;
		sq=sq/10;
	}
	System.out.println(sum);
	if(sum==no)
	{
		System.out.println("This is neon number");
	}
	else
	{
		System.out.println("This is not a neon number");
	}
}
}

//private void Armstrong_Number(int no) {
//	// TODO Auto-generated method stub
//	int sum=0; int r; int no2=no;
//	while(no>0)
//	{
//		r=no%10;
//		sum=sum+(r*r*r);
//		no=no/10;
//	}
//	System.out.println(sum);
//	if(sum==no2)
//	{
//		System.out.println("This is armstrong number");
//	}
//	else
//	{
//		System.out.println("This is not an armstrong number");
//	}
//}
//}

//private void perfect_Number(int no) {
//	// TODO Auto-generated method stub
//	int div=1;
//	int sum=0;
//	while(div<no)
//	{
//		if(no%div==0)
//		{
//		sum=sum+div;
//		}
//		div++;
//	}
//	//System.out.println(sum);
//	if(sum==no)
//	{
//	System.out.println(sum+ " is perfect number");
//	}
//	else
//	{
//	System.out.println(sum+ " is not a perfect number");	
//	}
//}
//}

//private void palindrome(int no) {
//	// TODO Auto-generated method stub
//	int rev=0;
//	int no2=no;
//	int rem;
//	while(no>0)
//	{
//	rem=no%10;
//	rev=(rev*10)+rem;
//	no=no/10;
//	}
//	System.out.println(rev);
//	if(rev==no2)
//	{
//		System.out.println("This is palindrome");
//	}
//	else
//	{
//		System.out.println("This is not a palindrome");
//	}
//}
//}

//private void reversing_number(int no) {
//	// TODO Auto-generated method stub
//	int rev=0;
//	int rem;
//	while(no>0)
//	{
//	rem=no%10;
//	rev=(rev*10)+rem;
//	no=no/10;
//	}
//	System.out.println(rev);
//}
//}

//private void sum_of_Digits(int no) {
//	// TODO Auto-generated method stub
//	int sum=0;
//	int x;
//	while(no>0)
//	{
//		x=no%10;  //6 5 7
//		sum=sum+x;
//		no=no/10;
//	}
//	System.out.println(sum);
//	if (sum>9)
//	{
//		no=sum;
//		sum_of_Digits(no);
//	}
//}
//}


//private void count_Number(int no) {
//	// TODO Auto-generated method stub
//	int count=0;
//	while(no>0)
//	{
//		System.out.print(no%10);
//		no=no/10;
//		count++;
//	}
//		System.out.println("Count of number is " + count);
//}
//}


//private void reverse_Number(int no) {
//	// TODO Auto-generated method stub
//	while(no>0) {
//		System.out.print(no%10);
//		no=no/10;
//	}	
//}
//}
package programmBasics;

public class Lcm {
public static void main(String[] args) {
	Lcm lc=new Lcm();
//	lc.divisor_of_Number(100);
//	lc.common_Divisor(400,4000);
//	lc.common_Divisor2(100,110);
//	lc.greatest_Common_Divisor2(100,110);
//	lc.least_Common_Multiple(5,10);
//	lc.operator(4,8);
//	int result=lc.saquare_of_numbers(2,5);
//	System.out.println(result);
//	int result=lc.square_of_numbers2(3,8);
//	System.out.println(result);
//	System.out.println(Math.max(2, 5));
//	lc.addition_first_n_numbers(50);
//	int result=lc.multiplication_first_n_numbers(5);
//	System.out.println(result);
//	String result=lc.decimal_to_binary(37);
//	System.out.println(result);
	int result1 =lc.binary_to_decimal(100101);
	System.out.println(result1);
}

private int binary_to_decimal(int no) {
	// TODO Auto-generated method stub
	int total=0; int power=0;	int rem;
	while(no>0){
		{
			int num=no%10;
			rem=num*square_of_numbers2(2,power);
			total=total+rem;
			no=no/10;
		}
		power++;
	}
	return total;
}

//private String decimal_to_binary(int no) {
//	// TODO Auto-generated method stub
//	String binary="";
//	while(no>0)
//	{
//	 int rem=no%2;
//	 binary=rem+binary;
//	 no=no/2;
//	}
//	return binary;
//}
//}
//private int multiplication_first_n_numbers(int no) {
//	// TODO Auto-generated method stub
//	int total=1; int days=1;
//	while(days<=no) {
//		 total=total*days;
//		days++;
//	}
//	return total;
//}
//}

//private void addition_first_n_numbers(int no) {
//	// TODO Auto-generated method stub
//	int no1=0; int days=1; 
//	while(days<=no) {
//		no1=no1+days;
//		days++;
//	}
//	System.out.println(no1);
//}
//}

private int square_of_numbers2(int no, int pow) {
	// TODO Auto-generated method stub
	int no1=1 ,va2=0;
	while(va2<pow)
	{
		no1=no1*no;
		va2++;
	}
	return no1;
}
}
//private int saquare_of_numbers(int no, int pow) {
//	// TODO Auto-generated method stub
//	int sum=1;
//	while(pow>0)
//	{
//		sum=sum*no;
//		pow--;
//	}
//	return sum;
//}
//}

//private void operator(int no1, int no2) {
//	// TODO Auto-generated method stub
//	System.out.println(no1++ + no1++  + ++no2 - --no2);
//	System.out.println(no1);
//	System.out.println(no2);
//}
//}
//private void least_Common_Multiple(int no1, int no2) {
//	// TODO Auto-generated method stub  
//	int big=no1>no2 ? no1:no2;
//	while(true) {
//	if(big%no1==0 && big%no2==0)
//	{
//		System.out.println(big);
//		break;
//	}
//	big++;
//	}	
//}
//}

//
//private void greatest_Common_Divisor2(int no1, int no2) {
//	
//	int div=2,gcd=0;
//	int small=no1>no2? no1: no2;
//	while(div<small) {
//		if(no1%div==0 && no2%div==0)
//		{
//			gcd=div;
//		}
//		div++;
//		}
//	System.out.println(gcd);
//}
//}

//private void common_Divisor2(int no1, int no2) {
//	// TODO Auto-generated method stub
//int div=2;
//int small=no1<no2 ? no1 :no2;
//while(div<=small) {
//	if(no1%div==0 && no2%div==0) {
//		System.out.println(div);
//	}
//	div++;
//}
//}
//}

//private void common_Divisor(int no1, int no2) {
//	// TODO Auto-generated method stub
//	int div=2, small=0;
//	if(no1>no2)
//	{
//		small=no1;
//	}
//	else
//	{
//		small=no2;
//	}
//	while((div<=small)) {
//	if(no1%div==0 && no2%div==0)
//	{
//		System.out.println(div);
//		
//	}div++;
//	}
//	
//}
//}


//private void divisor_of_Number(int  no) {
//	// TODO Auto-generated method stub
//	int div=1;
//			while(div<=no)
//	{
//		if(no%div==0) {
//			System.out.println(div);
//				}
//		div++;
//    }
//}
//}

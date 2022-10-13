package programmBasics;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_Series fs=new Fibonacci_Series();
//		fs.fibonacci_series1(0,1);
//		fs.fibonacci_series2(-1,1);
//		fs.fibonacci_series2(-1,1);
		fs.fibonacci_series3(-1,1);
	}

	private void fibonacci_series3(int first, int second) {
		// TODO Auto-generated method stub
		int count=1;
		while(count<20)
		{
			System.out.println(first+second);
			second=second+first;
			first=second-first;
			count++;
		}
	}
}

//	private void fibonacci_series2(int a, int b) {
//		// TODO Auto-generated method stub
//		int total=0, count=1;
//		while(count<=10)
//		{
//			total=a+b;
//			System.out.println(total);
//			a=b;
//			b=total;
//			count++;
//		}
//	}
//}

//	private void fibonacci_series2(int a, int b) {
//		// TODO Auto-generated method stub
//		int total=0;
//		while(total<50)
//		{
//			total=a+b;
//			System.out.println(total);
//			a=b;
//			b=total;
//			
//		}
//	}
//}

//	private void fibonacci_series1(int first,int second) {
//		// TODO Auto-generated method stub
//		int total=0;
//		while(total<25)
//		{
//		total=first+second;
//		System.out.println(total);
//		first=second;
//		second=total;
//		}
//	}
//}

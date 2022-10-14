package programmBasics;

public class Pattern_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_Program pp=new Pattern_Program();
//		pp.pattern_program1();
//		pp.pattern_program2();
//		pp.pattern_program3();
//		pp.pattern_program4();
//		pp.pattern_program5();
//		pp.pattern_program6();
		pp.pattern_program6();
		
	}

	private void pattern_program6() {
		// TODO Auto-generated method stub
		for(int j=2; j<=10; j+=2)
		{
		for (int i=1; i<=5; i++)
		{
			System.out.print(((i*j)/2)+ " ");
		}
		System.out.println();
	}
}
}
//	private void pattern_program6() {
//		// TODO Auto-generated method stub
//		int col=1; int count=0;
//		for( col=100; col>=1; col--)
//		{
//			System.out.print(col+ " ");
//			count++;
//			if(count%5==0)
//			{
//			System.out.println();
//			}
//		}
//	}
//}

//	private void pattern_program5() {
//		// TODO Auto-generated method stub
//		for( char row='A'; row<='F'; row++)
//		{
//		for(char col='A'; col<='F'; col++)
//		{
//			System.out.print(row+ " ");
//		}
//		System.out.println();
//		}
//	}
//}

//	private void pattern_program4() {
//		// TODO Auto-generated method stub
//		for(int row=5; row>=1; row--)
//		{
//		for(int col=1; col<=5; col++)
//		    { System.out.print(row+" "); }
//		System.out.println(); 
//	}
//}
//}

//	private void pattern_program3() {
//		// TODO Auto-generated method stub
//		
//		for(int row=1; row<=5; row++ ) 
//		{
//		for(int col=5; col>=1; col--)
//		{
//			System.out.print(col+ " ");
//		}
//		System.out.println();
//		
//		}
//}
//}

//	private void pattern_program2() {
//		// TODO Auto-generated method stub
//		int row=1;
//		do
//		{
//			for(int col=1; col<=4; col++)
//			{
//				System.out.print(col+ " ");
//			}
//	
//			System.out.println();
//			row++;}
//		while(row<=4);	
//}
//}

//	private void pattern_program1() {
//		// TODO Auto-generated method stub
//		int col=1;
//		for(col=1; col<=5; col++)
//		{
//			System.out.print(col+ " ");
//		}
//		System.out.println();
//		for(col=1; col<=5; col++)
//		{
//			System.out.print(col+ " ");
//		}
//		System.out.println();
//		for(col=1; col<=5; col++)
//		{
//			System.out.print(col+ " ");
//		}
//		System.out.println();
//	}
//
//}

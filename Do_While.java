package programmBasics;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Do_While dw=new Do_While();
    dw.practice_do_while_program();
	}

	private void practice_do_while_program() {
		// TODO Auto-generated method stub
		 int row=1; 
		do
		{
			int coloumn=1;
			do {
				int x= row*coloumn;
				System.out.printf("%4d", +x);
				coloumn++;
			}
			while(coloumn<=5);
			System.out.println("\n");
			row++;
		}
			while(row<=5);
				
		
}
}


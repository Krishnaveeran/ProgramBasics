package arrayafter;

import java.io.IOException;

public class ExceptionDemo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExceptionDemo4 ed=new ExceptionDemo4();
		ed.method();
	}

	private void method() throws IOException{
		// TODO Auto-generated method stub
	
		throw new IOException("Exception occured");
	}
}

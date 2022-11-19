package arrayafter;

public class F_I_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functional_Interface_Demo fid=	(a,b)-> {
			int f=25;
			int g=25;
			
			return a+b+f+g;
					};
		
		System.out.println("Addition of four value are "+fid.display(20,30));

	}

}

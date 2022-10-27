package programmBasics;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Float flo=Float.valueOf(3.4f);
		float ff=flo.floatValue(); //unboxing
		float fff= Float.valueOf(flo);
		System.out.println(ff+" "+fff); 
		
		Integer i=Integer.valueOf(10);
		int a=i;  // autounboxing
		int b=i.intValue(); //unboxing
		int c=i.valueOf(i); //unboxing
		System.out.println(a+" "+b+" "+c);
		
		
		float f=4.5f;   
		Float fl=Float.valueOf(f);  //boxing
		Float fl1=f;//autoboxing	
		System.out.println(f+" "+fl+" "+fl1);
		
	}

}

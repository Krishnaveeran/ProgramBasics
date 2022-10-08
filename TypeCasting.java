package programmBasics;

public class TypeCasting {
	public static void main(String[] args) {
		int myInt=10;
		double dou=myInt;
		System.out.println(dou);
		System.out.println(myInt); // widening casting
		
		double a=34.987d;
		int inte=(int)a;
		System.out.println(inte);  // narrowing casting
		
		float flo=567.908f;
		long lo=(long)flo;
		System.out.println(lo);  //narrowing casting
		
//		float floa=3.14f;
//		String  s=(String)flo;  // Cannot convert float to string
//		System.out.println(s);
		
//		String st="String";
// 		float fLoA=(float)st;  // Cannot cast from string to float
//	    System.out.println(fLoA);
		
		byte b=1;
		short s=(byte)b;
		int t= (int)s;
		System.out.println(s);
		System.out.println(t);
		
//		TypeCasting graduate=new TypeCasting();
//		Sengineer se=(Sengineer)graduate;
//		se.method;

		
		
		
}
}

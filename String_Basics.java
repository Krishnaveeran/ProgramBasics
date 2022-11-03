package arrayafter;

public class String_Basics  {

	public static void main(String[] args) {
		String_Basics st = new String_Basics();
//		st.string_hashcode();
//		st.char_at();
		st.basic_method();
	}

	private void basic_method() {
		// TODO Auto-generated method stub
		
		String citizen = "anatharaman";
		
		System.out.println(citizen.contains("man"));
		System.out.println(citizen.contains("tharan"));
		
		System.out.println();
		
		System.out.println(citizen.startsWith("ana"));
		System.out.println(citizen.startsWith("asd"));

		System.out.println();
		
		System.out.println(citizen.endsWith("man"));
		System.out.println(citizen.endsWith("min"));
		
		System.out.println();
		
		String citizen1 = "anandaraman"; 
		System.out.println(citizen1.equals("anandaraman"));
		System.out.println(citizen1.equals("anand"));

		System.out.println();
		
		String name1="8jayuak";
		String name2="krishna";
		String name3="KRISHNA";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.indexOf('a'));
		System.out.println(name1.lastIndexOf('a'));
		System.out.println();
		
		System.out.println(name2.toUpperCase());
		System.out.println(name2.toLowerCase());
		
		String name4="KRISHNA";
		
		System.out.println(name4.replace('K', 'U'));
		System.out.println(name4);
		
		String train = "the new indian express"; 
		System.out.println(train.replace('s', '$'));
		System.out.println(train.substring(0,8));
		
		System.out.println();
		
		String citizen5= "28-10-2022-6666"; 

		String date="30-10-2022";
		
		String[] name=date.split("-");
		for(int i=0; i<name.length; i++)
		{
			System.out.print(name[i]+" ");
		}
		
		System.out.println(); 
		
		String s1="Hello";
		String s2="Hell0";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("\n"); 
		
		String id1=new String("1234");
		String id2=new String("1234");
	
		System.out.println(id1.hashCode());
		System.out.println(id2.hashCode());
		
		char[] ar= {'j','a','v','a'};
		
		String ss=new String(ar,0,4);
		System.out.println(ss);
		
		
	}
}
	
	
/*
	private void char_at() {
		// TODO Auto-generated method stub

		String citizen = "indian";

		System.out.println(citizen.charAt(0));
		System.out.println(citizen.charAt(1));
		System.out.println(citizen.charAt(2));
		System.out.println(citizen.charAt(3));
		System.out.println(citizen.charAt(4));
		System.out.println(citizen.charAt(5));
		System.out.println();

		for (int i = 0; i < citizen.length(); i++) {
			System.out.println(citizen.charAt(i));
		}
	}
}
*/

	

	/*
	 
	private void string_hashcode() {
		// TODO Auto-generated method stub
		String name1="krishna";
		String name2="krishna";
		String name3="krishna";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		name1="KRISHNA";
		System.out.println(name1.hashCode());
	}
}
	 */
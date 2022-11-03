package arrayafter;

public class String_Basics3 {
	
int id;
String name;	
	
public String_Basics3(String name,int id) {
		// TODO Auto-generated constructor stub
	
	this.name=name;
	this.id=id;
	}

public String toString()
{
	int id=2;
	return ""+this.id;
}

public static void main(String[] args) {
	
	String_Basics3 sb=new String_Basics3("Krishna", 810014);
	String s=new String("Krishna");
	
	System.out.println(sb);
	System.out.println(s);
}
}

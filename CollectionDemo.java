package arrayafter;

import java.util.List;
 import java.util.ArrayList;
public class CollectionDemo {

	int id;
	public CollectionDemo(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}



	public String toString()
	{
		return  ""+id;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo cd=new CollectionDemo(8100);	
		
		cd=null;
		
		List li=new ArrayList();
		li.add("Krishna");
		li.add(123);
		li.add(5.5f);
		li.add(true);    //1
		li.add(cd);
		System.out.println(li);
		boolean result=li.add("hi");
		System.out.println(result);
		
		System.out.println(li);
		
		li.add(4,"hi");  //2

		System.out.println(li);
		
		List li2=new ArrayList();

		li2.add("virus");
		li2.add(50);
		li2.add(true);
		li2.add(3.3);
		li2.add(cd);
		
		System.out.println(li2);
		li.addAll(li2);              //3
		System.out.println(li);
		
		li.addAll(1,li2);
		System.out.println(li);  //4
		
		li2.remove(4);
		System.out.println(li2);  //5
		
		List li3=new ArrayList();
		li3.add(li2.get(0));  //6
		System.out.println(li3);
		
		System.out.println(li.indexOf(123));   //7
		System.out.println(li.lastIndexOf("hi"));  //8
		
		li2.set(2, li);
		System.out.println(li2);  //9


		
		

	}

}

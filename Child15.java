package programmBasics;

	 public class Child15 implements Inter{
			
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("this is Interface abstract method");
			}
			 void show()
			{
			System.out.println("Show method in child ");	
			
			}
			public static void main(String[] args) {
				Child15 ch=new Child15();
				ch.display();
				ch.show();
			}
		}


package arrayafter;

public class Arrays_Of_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] sObj=new Student[2];
		
		sObj[0]=new Student(810014, "Krishna");
		sObj[1]=new Student(810015, "Moorthy");
		
		sObj[0].display();
		sObj[1].display();
		
	}

}


class Student
{
	int id;
	String name;

	
	public Student(int id, String name)
	{
		
		this.id=id;
		this.name=name;
	
	}


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Student id is "+id+" Student name is "+name);
		
	}
}




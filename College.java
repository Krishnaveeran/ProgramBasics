package programmBasics;


public class Student {

	public int roll_no;
	public String name;
	
	public Student(int roll_no, String name) {
		// TODO Auto-generated constructor stub
		
		this.roll_no=roll_no;
		this.name=name;
		
	}
 }
public class College {
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

	 Student[] arr=new Student[5]; //Array declaration & Memory creation of 5 for student object
		arr[0]=new Student(1,"Krishna");
		arr[1]=new Student(2,"Priya");
		arr[2]=new Student(3,"Amir");
		arr[3]=new Student(4,"Dhilip");
		arr[4]=new Student(5,"Payilagam");
		
		for(int i=0; i<arr.length; i++)
		System.out.println("Student id is "+arr[i].roll_no +" and name is "+ arr[i].name);
 }

}


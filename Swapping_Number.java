package programmBasics;

public class Swapping_Number {
	
public static void main(String[] args) {
	Swapping_Number sn=new Swapping_Number();
//	sn.swapping_number_with_variable(10,20);
//	sn.swapping_number_without_variable1(10,20);
//	sn.swapping_number_without_variable1(10,20);
	sn.swapping_number_without_variable2(10, 20);
}

private void swapping_number_without_variable2(int i, int j) {
	// TODO Auto-generated method stub
		i=i*j;   //200
		j=i/j;   //10
		i=i/j;   //20
		System.out.println(i+" "+j);
}
}
//private void swapping_number_without_variable1(int no1, int no2) {
//	// TODO Auto-generated method stub
//	no1=(no1*no2);  //200
//	no2=no1/no2;    //10
//	no1=no1/no2;
//	System.out.println(no1+" "+no2);
//}
//}

//private void swapping_number_without_variable1(int no1, int no2) {
//	// TODO Auto-generated method stub
//	no1=no1+no2;  // 30
//	no2=no1-no2;  //10
//	no1=no1-no2;//
//	System.out.println(no1+" "+no2);
//}
//}
/*
private void swapping_number_with_variable(int a, int b) {
	// TODO Auto-generated method stub	
	int t;
	t=b;
	b=a;
	a=t;
	System.out.println("a is "+a+" " +"b is " + b);
}
}  */

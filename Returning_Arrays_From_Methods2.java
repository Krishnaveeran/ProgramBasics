package programmBasics;

public class Returning_Arrays_From_Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=m1();
		for(int i=0; i<arr.length; i++)
		System.out.println(i+1+" is "+arr[i]+ " ");
	}

	private static int[] m1() {
		// TODO Auto-generated method stub
		return new int [] {1367,4386,4839,8923};
	}
}

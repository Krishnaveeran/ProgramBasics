package programmBasics;

public class Returning_Arrays_From_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr=new float[5];
		arr[0]=55.70f;
		arr[1]=87.60f;
		arr[2]=68.40f;
		arr[3]=59.60f;
		arr[4]=72.50f;
		
		float result=min(arr);
		System.out.println(result);
	}

	private static float[] min(float[] arr) {
		// TODO Auto-generated method stub
		float total=0;
		for(int i=0; i<arr.length; i++)
			total+=arr[i];
		return total;
		
	}

}

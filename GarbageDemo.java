package arrayafter;

public class GarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.gc(); // Static Method

		Runtime rt = Runtime.getRuntime(); // singleton class
		rt.gc(); // non-static method calling
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());

	}

}

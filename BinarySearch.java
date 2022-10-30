package arrayafter;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 12, 17, 19, 23, 35, 67 };

		int key = 23;
		int s = 0, e = ar.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (key == ar[mid]) {
				System.out.println(key + " present at position of " + mid);
				break;
			} else if (key > ar[mid]) {
				s = mid + 1;
			} else if (key < ar[mid]) {
				e = mid - 1;
			}
		}
		if (s > e) {
			System.out.println("Number not present in array");
		}
	}
}

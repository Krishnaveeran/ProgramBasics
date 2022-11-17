package arrayafter;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionRealTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mb1 = new Mobile("Vivo Y11", 10000, 4);
		Mobile mb2 = new Mobile("Apple iphone 14 pro max ", 139000, 16);
		Mobile mb3 = new Mobile("Samsung M53", 26000, 6);
		Mobile mb4 = new Mobile("Samsung M13", 11000, 4);

		ArrayList al = new ArrayList();

		al.add(mb1);
		al.add(mb2);
		al.add(mb3);
		al.add(mb4);
		System.out.println(al);

		Iterator itr = al.iterator();
		boolean value = itr.hasNext();

		while (itr.hasNext()) {
			Object obj = itr.next();
			Mobile mobile = (Mobile) obj;
			String str = mobile.model;
			int price = mobile.price;
			int ram = mobile.ram;

			if (str.contains("Samsung") && ram > 4) {  
				System.out.println(mobile);
			}
//			value = itr.hasNext();

		}
	}

}

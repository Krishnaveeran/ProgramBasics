package arrayafter;

public class Fruit {

	private int price;
	private String name;

	public Fruit(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public Fruit(Fruit fruit) {
		name = fruit.name;
		price = fruit.price;
		System.out.println(name);
		System.out.println(price);

	}

	public static void main(String[] args) {

		Fruit fr1 = new Fruit(123, "Pineapple");
		Fruit fr2 = new Fruit(fr1);
		System.out.println(fr1 == fr2);
	}

}

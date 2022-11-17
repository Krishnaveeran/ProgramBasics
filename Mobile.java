package arrayafter;

public class Mobile {
	String model;
	int price;
	int ram;

	public Mobile(String model, int price, int ram) {
		this.model = model;
		this.price = price;
		this.ram = ram;

	}

	public String toString() {

		return this.model + " " + this.price + " " + this.ram;
	}
}

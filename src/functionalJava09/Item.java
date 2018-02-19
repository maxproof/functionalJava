package functionalJava09;

public class Item {
	
	private String name;
	
	private int price;
	
	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	String getName() {
		return name;
	}

}

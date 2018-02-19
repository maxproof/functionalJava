package functionalJava09;

import java.util.List;

public class FunctionalJava {

	public static void main(String[] args) {
		
		Catalog cat = new Catalog();
		cat.add(new Item("bottle", 4));
		cat.add(new Item("sandwich", 5));
		cat.add(new Item("book", 10));
		
		List<Item> result = cat.searchItemPrice(it -> {return it.getPrice() < 6;});
		
		for(Item item : result) {
			System.out.println(cat.searchItemPrice(it -> {return it.getPrice() < 6;}));//list of "true"
			System.out.println(item.getPrice() < 6);//boolean from test Predicate
			System.out.println("item: " + item.getName());
		}
		
	}

}

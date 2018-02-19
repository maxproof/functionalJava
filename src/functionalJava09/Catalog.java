package functionalJava09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Catalog {
	
	List<Item> items = new ArrayList<Item>();
	
	void add(Item item) {
		items.add(item);
	}
	
	List<Item> searchItemPrice(Predicate<Item> func) {
		
		List<Item> returnVal = new ArrayList<Item>();
		
		for(Item it : items) {
			if(func.test(it)) {
				returnVal.add(it);
			}
		}
		return returnVal;
	}

}

package functionalJava08;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Client {
	
	private String name;
	private Bill bill;
	
	Client(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setBill(Bill bill ) {
		this.bill = bill;
	}
	
	String returnFunc(Function<Client, String> returned) {
		return returned.apply(this);
	}
	
	String link(BiFunction<Client, Bill, String> linked) {
		return linked.apply(this, bill);
	}

}

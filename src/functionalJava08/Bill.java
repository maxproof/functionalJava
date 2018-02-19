package functionalJava08;

import java.util.function.UnaryOperator;

public class Bill {
	
	//unary operator
	
	private String number;
	
	Bill(String number) {
		this.number = number;
	}
	
	String getNumber() {
		return number;
	}
	
	void increment(UnaryOperator<String> inc) {
		number = inc.apply(number);
	}

}

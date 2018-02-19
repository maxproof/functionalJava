package functionalJava10;

import java.util.function.IntSupplier;

public class FunctionalJava {

	public static void main(String[] args) {

		path(Fibonacci::next);
		path(Integers::get);

	}
	public static void path(IntSupplier supp) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("next: " + supp.getAsInt());
		}
		
	}

}

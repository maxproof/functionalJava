package functionalJava05;

import java.util.Arrays;

public class FunctionalJava {

	public static void main(String[] args) {
		
		Person[] personTable = new Person[2];
		personTable[0] = new Person("Max", 49);
		personTable[1] = new Person("Gertrude", 46);
		
		System.out.println(personTable[0]);
		System.out.println(personTable[1]);
		
		System.out.println("after compare2");
		Arrays.sort(personTable, Person::compare2);
		//sort wait an order relation via Person::compare2, ie. via compare2, with reference to compare2
		//=> EL no creation of interface 
		System.out.println(personTable[0]);
		System.out.println(personTable[1]);

	}

}

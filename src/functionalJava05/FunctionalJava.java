package functionalJava05;

import java.util.Arrays;
import java.util.List;

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
		
		System.out.println("print list of numbers");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.forEach(System.out::println);
		//"method reference" = syntactic sugar for expressions like: 
		//numbers.forEach(x -> System.out.println(x));
		//
		/*The method reference System.out::println will evaluate System.out first, then create the equivalent 
		of a lambda expression which captures the evaluated value. Usually, you would use
		o->System.out.println(o) to achieve the same as the method reference, but this lambda 
		expression will evaluate System.out each time the method will be called.
		So an exact equivalent would be:

			PrintStream p = Objects.requireNonNull(System.out);
			numbers.forEach(o -> p.println(o));
		 
		which will make a difference if someone invokes System.setOut(…); in-between.*/

	}

}

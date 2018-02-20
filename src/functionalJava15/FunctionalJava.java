package functionalJava15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//STREAM

public class FunctionalJava {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Max");
		list.add("Gertrude");
		list.add("Jean-François"); 
		list.add("Patt");
		
		list
			.stream()
			.filter(s -> s.length() > 5)
			.forEach(System.out::println);
			
		Stream.of("Max", "Gertrude", "Patt", "Jean-François")
			.filter(s -> s.length() <5)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		Stream.of(5, 3, 7,2)
			.filter(s -> s < 5)
			.forEach(System.out::println);
		
		Optional<Integer> sum = Stream.of("Max", "Gertrude", "Patt", "Jean-François")
			.filter(s -> s.length() <5)
			.map(s -> s.length())
			.reduce(
					(n1, n2) -> n1 + n2
					);
		
		System.out.println("sum: " + sum.get());
		
	}

}

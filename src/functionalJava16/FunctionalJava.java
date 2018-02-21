package functionalJava16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class FunctionalJava {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Max");
		list.add("Norma");
		
		Stream<String> s = list.stream();
		
		s.forEach(System.out::println);
		
		Stream.of("Max", "Norman").forEach(System.out::println);
		
		Builder<String> b = Stream.builder();
		
		b.accept("Max");
		b.accept("Norman");
		
		b.build().forEach(System.out::println);
		
		DoubleStream.Builder bd = DoubleStream.builder();
		
		bd.accept(3.4);
		bd.accept(6.7);
		
		bd.build().forEach(System.out::println);
		
	}
	
}

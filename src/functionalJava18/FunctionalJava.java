package functionalJava18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalJava {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i < 10; i++ ) {
			list.add("" + i);
		}
		
		list.stream().forEach(System.out::println);
		System.out.println("------------");
		list.parallelStream().forEach(System.out::println);
		System.out.println("------------");
		
		List<Bill> bills = new ArrayList<Bill>();
		bills.add(new Bill("2018-02-21", 234.45));
		bills.add(new Bill("2018-02-13", 444.45));
		bills.add(new Bill("2018-02-08", 1274.45));
		bills.add(new Bill("2018-02-04", 934.45));
		bills.add(new Bill("2018-02-01", 34.45));
		
		String result = bills.stream()
				.filter(b -> b.getTotal() > 100)
				.parallel()
				.map(Bill::getNumber)
				.collect(Collectors.joining(":"));
		
		System.out.println("result " + result);
		System.out.println("------------");
		
		bills.parallelStream()
				.filter(b -> b.getTotal() > 100)
				.sequential()
				.map(Bill::getNumber)
				.forEach(System.out::println);
	}

}

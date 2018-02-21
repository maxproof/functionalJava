package functionalJava17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FunctionalJava {

	public static void main(String[] args) {
		
		List<Bill> bills = new ArrayList<Bill>();
		
		bills.add(new Bill("2018-02-21", 4599.59, "Max FL"));
		bills.add(new Bill("2018-02-20", 567.79, "Max FL"));
		bills.add(new Bill("2018-02-08", 4500.70, "Max FL"));
		bills.add(new Bill("2018-02-05", 14567.79, "Max FL"));
		bills.add(new Bill("2018-02-03", 4567.59, "Max FL"));
		bills.add(new Bill("2018-02-02", 2567.79, "Max FL"));
		bills.add(new Bill("2018-02-01", 667.79, "Max FL"));
		
		bills.stream().forEach(s -> System.out.println(s));
		System.out.println("----------------");
		bills.stream().filter(b -> b.getTotal() < 700).forEach(System.out::println);
		
		System.out.println("----------------");
		bills.stream().map(b -> b.getTotal()).filter(d -> d < 10000).forEach(System.out::println);
		
		System.out.println("----------------");
		Optional<Double> result = bills.stream().map(b -> b.getTotal()).filter(d -> d < 10000).reduce(Double::sum);
		System.out.println("total " + result.get());
	}

}

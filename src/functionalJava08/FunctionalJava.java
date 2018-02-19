package functionalJava08;

public class FunctionalJava {

	public static void main(String[] args) {
		//Interface Function<T, R>
		Client myClient = new Client("Max");
		
		String string = myClient.returnFunc((Client c) -> {return c.getName();});
		System.out.println("returned client is: " + string);
		
		string = myClient.returnFunc((Client c) -> {return "<b>" + c.getName() + "</b>";});
		System.out.println("returned client is: " + string);
		
		Bill bill = new Bill("201802");
		System.out.println("initial bill: " + bill.getNumber());
		bill.increment(s -> {return s + "1";});
		System.out.println("final bill: " + bill.getNumber());
		
		myClient.setBill(bill);
		String result = myClient.link((Client c, Bill b) -> {return c.getName() + " " + b.getNumber();});
		System.out.println("result: " + result);
	}

}

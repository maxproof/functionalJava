package time04;

public class Time04 {

	public static void main(String[] args) {
		
		Bill bill = new Bill("56498735");
		System.out.println("Bill " + bill);
		
		bill.accept("01 01 2018");
		System.out.println("Bill " + bill);
		
		bill.acceptFormatter("The 1 of the month #1 of the year 2018");
		System.out.println("Bill " + bill);


	}

}

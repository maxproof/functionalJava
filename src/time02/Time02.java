package time02;

public class Time02 {

	public static void main(String[] args) {
		
		Bill bill = new Bill("4564754754");
		System.out.println("Bill : " + bill);
		
		ZonedBill zonedBill = new ZonedBill("9863746234");
		System.out.println("ZonedBill : " + zonedBill);
		
		System.out.println("Remain today " + zonedBill.beforeTerm());
		System.out.println("Remain today (last day of year) " + zonedBill.beforeTermLastDayOfYear());

	}

}

package functionalJava18;

public class Bill {
	
	private String number;
	private double total;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public Bill(String number, double total) {
		this.number = number;
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "number " + number + " total" + total;
	}

	
}

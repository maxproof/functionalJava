package functionalJava17;

public class Bill {
	
	private String number;
	private double total;
	private String client;
	
	public Bill(String number, double total, String client) {
		this.number = number;
		this.total = total;
		this.client = client;
	}
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
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	@Override
	public String toString() {
		return "Number " + number + " total " + total + " client " + client;
	}
	

}

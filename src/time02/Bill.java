package time02;

import java.time.LocalDate;
import java.time.Period;

public class Bill {
	
	private String number;
	private LocalDate date;
	private LocalDate term;
	static private Period maxDuration = Period.of(0,  2,  0);
	
	public Bill(String number) {
		this.number = number;
		date = LocalDate.now();
		term = date.plus(maxDuration);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Number=" + number + ", date=" + date.toString() + ", term=" + term;
	}

}

package time02;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ZonedBill {
	
	private String number;
	private ZonedDateTime date;
	private ZonedDateTime term;
	static private Period maxDuration = Period.of(0,  2,  0);
	
	public ZonedBill(String number) {
		this.number = number;
		date = ZonedDateTime.now();
		term = date.plus(maxDuration);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Number=" + number + ", date=" + date.toString() + ", term=" + term;
	}
	
	public long beforeTerm() {
		return LocalDate.now().until(term, ChronoUnit.DAYS);
	}
	
	public long beforeTermLastDayOfYear() {
		return LocalDate.now().until(term.with(TemporalAdjusters.lastDayOfYear()), ChronoUnit.DAYS);
	}

}

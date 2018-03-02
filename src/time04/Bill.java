package time04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Bill {
	
	private String number;
	private LocalDate date;
	
	public Bill(String number) {
		this.number = number;
		this.date = LocalDate.now();
	}
	
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyy");
	
	private DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
			.appendLiteral("The ")
			.appendValue(ChronoField.DAY_OF_MONTH)
			.appendLiteral(" of the month #")
			.appendValue(ChronoField.MONTH_OF_YEAR)
			.appendLiteral(" of the year ")
			.appendValue(ChronoField.YEAR);

	public String toString() {
		//return "number " + number + " date " + date.toString();
		//return "number " + number + " date " + date.format(dtf);
		return "number " + number + " date " + date.format(dtfb.toFormatter());
	}
	
	public void accept(String string) {
		date = LocalDate.parse(string, dtf);
	}
	
	public void acceptFormatter(String string) {
		date = LocalDate.parse(string, dtfb.toFormatter());
	}
	
}

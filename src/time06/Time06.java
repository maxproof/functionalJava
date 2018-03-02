package time06;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time06 {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(1968, Month.AUGUST, 31, 8, 0, 0);
		JapaneseDate jdate = JapaneseDate.from(date);
		System.out.println(jdate);
		
		MinguoDate mdate = MinguoDate.from(date);
		System.out.println(mdate);
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(date.format(formatter));
		
		formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(formatter));
		
		formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(date.format(formatter));


	}

}

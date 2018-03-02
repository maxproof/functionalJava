package time01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Time01 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.of(12, 12);
		
		ldt.minusMinutes(12);
		
		System.out.println(ldt + " -- " + lt + " -- " + ldt.minusMinutes(12));

		ZoneId zid = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zid);
		
		System.out.println(zid + " -- " + zdt);
		
		Period p = Period.of(1, 0, 0);
		
		LocalDate ld = LocalDate.now();
		ld.plus(p);
		System.out.println(p + " -- " + ld + " -- " + ld.plus(p));
		
		Chronology c = Chronology.ofLocale(Locale.FRENCH);
		ChronoLocalDate cld = c.dateNow();
		int year = cld.get(ChronoField.YEAR);
		System.out.println(c + " -- " + cld + " -- " + year);
		
		cld = JapaneseDate.now();
		year = cld.get(ChronoField.YEAR);
		System.out.println(cld + " -- " + year);
		
	}

}

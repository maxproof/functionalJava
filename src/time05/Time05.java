package time05;

import java.time.chrono.*;
import java.util.Set;

public class Time05 {

	public static void main(String[] args) {
		
		Set<Chronology> chronologies = Chronology.getAvailableChronologies();
		for(Chronology c : chronologies) {
			System.out.println(c.toString());
		}
		
		Chronology japanese = Chronology.of("Japanese");
		System.out.println(japanese);
		
		ChronoLocalDate cldj = japanese.dateNow();
		System.out.println(cldj.toString());
		
		System.out.println(cldj.getEra());
		
		System.out.println(cldj.lengthOfYear());

	}

}

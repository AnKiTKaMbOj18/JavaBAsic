package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
 *Java LocalDateTime class is an immutable date-time object that represents a date-time,
   with the default format as yyyy-MM-dd-HH-mm-ss.zzz.
   It inherits object class and implements the ChronoLocalDateTime interface.
  *
  */

public class ExampleLocalDateTime03 {
	public static void main(String[] args) {
		// LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(formatter);

		System.out.println("After Formatting: " + formatDateTime);

		// LocalDateTime Example: get()
		LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
		System.out.println(a.get(ChronoField.DAY_OF_WEEK));
		System.out.println(a.get(ChronoField.DAY_OF_MONTH));
		System.out.println(a.get(ChronoField.DAY_OF_YEAR));
		System.out.println(a.getDayOfWeek());
		
	}
}

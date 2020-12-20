package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Java LocalDate class is an immutable class that represents Date with a default format of YYYY-MM-DD.
 * It inherits Object class and implements the ChronoLocalDate interface
*/

public class ExampleLocalDate01 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalDate yesterday = localDate.minusDays(1);
		LocalDate tommorow = yesterday.plusDays(2);
		System.out.println("Today's Date: " + localDate);
		System.out.println("Yesterday's Date: " + yesterday);
		System.out.println("Tommorow's Date: " + tommorow);

		System.out.println("Day of month: " + localDate.getDayOfMonth());

		// To check for leap year
		LocalDate date = LocalDate.of(2017, 05, 10);
		System.out.println("Is Leap Year: " + date.isLeapYear());

		LocalDate date1 = LocalDate.of(2020, 05, 10);
		System.out.println("Is Leap Year: " + date1.isLeapYear());

		// LocalDate Example: atTime()
		LocalDate date2 = LocalDate.of(2019, 05, 23);
		LocalDateTime localDateTime = date2.atTime(1, 20, 50);
		System.out.println("LocalDateTime from DateTime using atTime: " + localDateTime);
	}
}

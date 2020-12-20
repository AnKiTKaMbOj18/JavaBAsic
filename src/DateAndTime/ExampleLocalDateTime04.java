package DateAndTime;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;

/*
 * Java MonthDay class is an immutable date-time object that represents the combination of a month and day-of-month.
 *  It inherits Object class and implements the Comparable interface.
 */

public class ExampleLocalDateTime04 {
	public static void main(String[] args) {
		MonthDay month = MonthDay.now();
		System.out.println(month);
		LocalDate localDate = month.atYear(1994);
		System.out.println(localDate);
		System.out.println(localDate.getDayOfWeek());
		System.out.println(month.isValidYear(2020));
		System.out.println(month.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(month.range(ChronoField.MONTH_OF_YEAR));
		System.out.println(month.range(ChronoField.DAY_OF_MONTH));
	}
}

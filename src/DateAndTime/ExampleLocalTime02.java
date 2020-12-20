package DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/*
 *Java LocalTime class is an immutable class that represents time with a default format of hour-minute-second.
 *It inherits Object class and implements the Comparable interface. 
 */

public class ExampleLocalTime02 {

	public LocalTime getDateTime() {
		LocalTime localTime = LocalTime.now();
		return localTime;
	}

	public static void main(String[] args) {
		ExampleLocalTime02 ex = new ExampleLocalTime02();
		System.out.println(ex.getDateTime());

		// LocalTime with Of()
		LocalTime time = LocalTime.of(10, 43, 12);
		System.out.println(time);

		// LocalTime using minusHours() and minusMinutes()
		LocalTime lt = LocalTime.of(10, 43, 12);
		LocalTime lt1 = lt.minusHours(2);
		LocalTime lt2 = lt1.minusMinutes(34);

		System.out.println(lt2);

		// LocalTime using plusHours() and plusMinutes()
		LocalTime ltime = LocalTime.of(10, 50, 40);
		LocalTime ltime1 = ltime.plusHours(1);
		LocalTime ltime2 = ltime1.plusMinutes(10);

		System.out.println(ltime2);

		// LocalTime Example
		ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");
		ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");

		LocalTime time1 = LocalTime.now(zoneId1);
		System.out.println("India Time Zone: " + time1);

		LocalTime time2 = LocalTime.now(zoneId2);
		System.out.println("Japan Time Zone: " + time2);

		long hours = ChronoUnit.HOURS.between(time1, time2);
		System.out.println("Hours between India and Japan timezones: " + hours);

		long minutes = ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("Minutes between India and Japan timezones: " + minutes);
	}
}

package testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import DateAndTime.ExampleLocalTime02;

public class DateTimeTest02 {

	@Test
	public void getLocalDate() {
		ExampleLocalTime02 ex = new ExampleLocalTime02();
		LocalTime expectedLocalTime = LocalTime.now();
		LocalTime result = ex.getDateTime();
		assertEquals(expectedLocalTime , result);
	}
}

package etc;

import java.time.LocalTime;

public class LocalTimeZoneTest {

	public static void main(String[] args) {
		int millis = 5000;
		int seconds = millis / 1000; // Maybe no need to divide if the input is in seconds
		LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds);
		String time = timeOfDay.toString();
		System.out.println(time);
	}
}

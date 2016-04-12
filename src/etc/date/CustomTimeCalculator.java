package etc.date;

import java.time.LocalTime;

public class CustomTimeCalculator {

	public static void main(String[] args) {
		int seconds = 306389;
		int i = seconds / 1000;
		System.out.println("i : "+i);
		LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds / 1000);
		System.out.println("타임오브데이 : "+timeOfDay);
	}
}

package etc.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatternDate {
	
	public static void main(String[] args) {
		String str = "1986-04-08 12:30:34";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String format = now.format(formatter);
		System.out.println("날짜 포맷 : "+format);
		
		LocalDateTime t20160307 = LocalDateTime.of(2016, 3, 7, 12, 0, 0);
		LocalDateTime t20160307_22 = LocalDateTime.of(2016, 3, 10, 15, 0, 0);
		
		// LocalDateTime t12 = t20160307.plusHours(18);
		LocalDateTime t13 = t20160307_22.plusHours(24);
		System.out.println("12시 :" + t20160307.format(formatter));
		System.out.println("12시 :" + t20160307_22.format(formatter));
		
		
	}
}

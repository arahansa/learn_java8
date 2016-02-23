package etc;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestParkingTest {

	
	
	public static void main(String[] args) {
		System.out.println("헬로월드 ");
		
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println("1월인가요? "+ (nowTime.getMonthValue()==1));
		LocalDateTime y20160113 = LocalDateTime.of(2016, 1, 13, 0, 0);
		
		boolean before = nowTime.isBefore(y20160113);
		System.out.println("13일 이전인가요?"+before);
		
		LocalDateTime after3day = nowTime.plusDays(3);
		System.out.println("3일뒤가  13일이전인가요?"+after3day.isBefore(y20160113));
		
	}
}

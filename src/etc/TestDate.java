package etc;

import java.time.LocalDateTime;

public class TestDate {
	
	public static void main(String[] args) {
		int time = 21599/3600;
		System.out.println("타임 "+time);
		
		LocalDateTime ldf = LocalDateTime.now();
		System.out.println("타임 "+ldf);
		LocalDateTime plusMonths = ldf.plusMonths(1);
		System.out.println("한달 뒤 :"+plusMonths);
	}
	
	
	

}

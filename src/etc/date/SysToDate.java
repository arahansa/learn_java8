package etc.date;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class SysToDate {

	
	public static void main(String[] args) {
		long time = 1457956508000l;
		Date date = new Date(time);
		System.out.println(date);
		
		String purchaseDatepst = "2016-03-14 01:06:21 America/Los_Angeles";
		String resultString = StringUtils.substring(purchaseDatepst, 0, 19);
		System.out.println("결과 스트링 : "+resultString);
		
		String resultString2 = StringUtils.substring(null, 0, 2);
		System.out.println(resultString2);
		
	}
}

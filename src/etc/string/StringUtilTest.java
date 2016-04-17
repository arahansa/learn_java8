package etc.string;





import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilTest {

	@Test
	public void stringTest() throws Exception {
		int j=0;
		String test ="";
		long before = System.currentTimeMillis();
		
		for(int i=0;i<10000000;i++)
			if("".equals("teststestset"))
				j++;
		
		long after = System.currentTimeMillis();
		System.out.println("  time : " + (after-before));
	}
	
	@Test
	public void stringUtilTest() throws Exception {
		int j=0;
		String test ="";
		long before = System.currentTimeMillis();
		
		for(int i=0;i<10000000;i++)
			if(StringUtils.equals(test, "teststestset"))
				j++;
		
		long after = System.currentTimeMillis();
		System.out.println(" util  time : " + (after-before));
	}
}

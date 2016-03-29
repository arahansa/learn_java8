package etc.numberTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDeciamlTest {

	@Test
	public void testName() throws Exception {
		BigDecimal myMoney = new BigDecimal(100);
		BigDecimal requestMoney = new BigDecimal(1);
		
		System.out.println(myMoney.compareTo(requestMoney));
	}
	
}


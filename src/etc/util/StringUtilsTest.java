package etc.util;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testName() throws Exception {
		assertEquals(StringUtils.isEmpty(""), true);
		assertEquals(StringUtils.isEmpty(null), true);
	}
	
}

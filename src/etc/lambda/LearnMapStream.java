package etc.lambda;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LearnMapStream {

	@Test
	public void testName() throws Exception {
		Map<String, String> testMap = new HashMap<>();
		testMap.put("hi", "hello");
		testMap.put("인간", "구구");
		testMap.keySet().stream().forEach(n->System.out.println(testMap.get(n)));
	}
}

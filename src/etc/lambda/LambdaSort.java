package etc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdaSort {

	@Test
	public void testName() throws Exception {
		// lambda Sort
		List<Integer> intList = Arrays.asList(6,5,4,3);
		List<Integer> collect = intList.stream().sorted((e1, e2) ->Integer.compare(e1, e2)).collect(Collectors.toList());
		System.out.println("collect "+collect);
	}
	
}

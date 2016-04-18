package effectivejava.chap7_method;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysasListTest {

	@Test
	public void arrayAsListTest() throws Exception {
		int[] digits = {3,1,4,1,5,9,2,6,5,4};
		System.out.println(Arrays.asList(digits));
		System.out.println(Arrays.toString(digits));
	}
}

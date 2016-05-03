package etc.util;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringTest {

	public static void main(String[] args) {
		String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(10);
		System.out.println(randomAlphanumeric);
		System.out.println(10==randomAlphanumeric.length());
	}
}

package etc.optional;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {

	@Test
	public void testName() throws Exception {
		Optional<String> test = Optional.ofNullable(null);
		System.out.println("테스트 "+test.isPresent());
		
	}
}

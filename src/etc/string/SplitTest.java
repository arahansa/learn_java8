package etc.string;

import static org.junit.Assert.*;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SplitTest {

	@Test
	public void testName() throws Exception {
		String test="RAN/test/1000000001";
		String[] split = test.split("/");
		log.info("split: {}" , split[0]);
		log.info("split: {}" , split[1]);
		log.info("split: {}" , split[2]);
		log.info("split: {}" , split.length);
	}
}


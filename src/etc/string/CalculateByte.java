package etc.string;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class CalculateByte {

	private int maxByte = 40;
	
	@Test
	public void calculateByte() throws Exception {
		String testString = "가나다라히마바사아자히히후히흐흐";
		String stringTest = stringTest(testString);
		System.out.println("testString : "+stringTest);
	}

	public String stringTest(String testString) {
		try {
			final byte[] bytes = testString.getBytes("UTF-8");
			System.out.println("렝스 : "+bytes.length);
			int lastPosition = 0, iChar;
			if (bytes.length < maxByte)
				maxByte = bytes.length;
			for (int i = 0; i < maxByte; i++) {
				iChar = (int) bytes[i];
				if ((iChar > 127) || (iChar < 0)) {
					// 한글의 경우(2byte 통과처리)
					// 한글은 2Byte이기 때문에 다음 글자는 볼것도 없이 스킵한다
					i += 2; // 한개 더 해서 3byte
				}
				if (i < maxByte)
					lastPosition = i;
			}
			lastPosition++;
			return new String(bytes, 0, lastPosition, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
}

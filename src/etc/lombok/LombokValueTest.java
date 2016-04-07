package etc.lombok;

import etc.lombok.LombokValueTest.LombokValue;
import lombok.Data;
import lombok.Value;

public class LombokValueTest {

	public static void main(String[] args) {
		LombokValue of = LombokValue.of(20);
		System.out.println("of 로 만들어진 "+ of);
	}
	
	@Data
	@Value(staticConstructor="of")
	static class LombokValue{
		int age;
	}
	
}

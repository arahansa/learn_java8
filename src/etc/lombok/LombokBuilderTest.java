package etc.lombok;

import etc.lombok.LombokBuilder.LombokBuilderBuilder;

public class LombokBuilderTest {

	
	public static void main(String[] args) {
		LombokBuilder cky = LombokBuilder.builder().age(20).name("arahansa").testValue("testValue").build();
		System.out.println(cky);
	}
}

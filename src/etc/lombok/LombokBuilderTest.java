package etc.lombok;

import etc.lombok.LombokBuilder.LombokBuilderBuilder;

public class LombokBuilderTest {

	
	public static void main(String[] args) {
		LombokBuilderBuilder cky = LombokBuilder.builder().age(20).name("arahansa");
		System.out.println(cky);
	}
}

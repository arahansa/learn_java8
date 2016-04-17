package etc.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
public class LombokBuilder {
	
	private String name;
	private int age;

	public static class LombokBuilderBuilder{
		private String name;
		private int age;
		private String testValue;
		
		public LombokBuilderBuilder testValue(String testValue){
			this.testValue = testValue;
			return this;
		}
		
		public LombokBuilder build(){
			LombokBuilder lombokBuilder = new LombokBuilder();
			lombokBuilder.name = name;
			lombokBuilder.age = age;
			System.out.println("테스트?");
			return lombokBuilder;
		}
	}
}

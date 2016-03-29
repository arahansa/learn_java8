package etc.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LombokBuilder {
	
	private String name;
	private int age;

}

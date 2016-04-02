package etc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterringTest {

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("test", "apple", "pine", "guru");
		List<String> collect = list.stream().filter(n-> n.equals("test")).collect(Collectors.toList());
		
		System.out.println("test 를 가진 아이 : "+collect);
	}
}

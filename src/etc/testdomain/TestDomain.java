package etc.testdomain;

import lombok.Data;

@Data
public class TestDomain {
	private int age;
	private String name;
	
	public static void main(String[] args) {
		TestDomain testDomain = new TestDomain();
		System.out.println("테스트 도메인 :"+ testDomain);
	}
}

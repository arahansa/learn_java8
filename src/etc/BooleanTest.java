package etc;

public class BooleanTest {

	private boolean test;
	
	
	public boolean isTest() {
		return test;
	}


	public void setTest(boolean test) {
		this.test = test;
	}


	public static void main(String[] args) {
		BooleanTest booleanTest = new BooleanTest();
		System.out.println("값 :"+booleanTest.isTest());
	}
}

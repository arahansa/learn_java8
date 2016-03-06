package etc.effective.chap04;

public class HashTest {

	int i;
	public void setI(int i){
		this.i = i;
	}
	
	public static void main(String[] args) {
		HashTest hashTest = new HashTest();
		hashTest.setI(1);
		System.out.println("hashTest :: "+hashTest.hashCode());
		hashTest.setI(2);
		System.out.println("hashTest :: "+hashTest.hashCode());
	}
}

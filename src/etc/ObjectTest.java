package etc;

public class ObjectTest {

	public static void main(String[] args) {
		String name="후후";
		TestOBj testOBj = new TestOBj();
		testOBj.setName("후후");
		modiFyObj(testOBj);
		modifyName(name);
		System.out.println(testOBj);
		System.out.println("네임 ::"+ name);
	}
	
	private static void modiFyObj(TestOBj testobj){
		testobj.setName("하하");
	}
	private static void modifyName(String name){
		name = "하하";
	}
	
	
	static class TestOBj{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "TestOBj [name=" + name + "]";
		}
		
		
	}
}


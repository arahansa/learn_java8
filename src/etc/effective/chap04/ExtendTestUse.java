package etc.effective.chap04;

import java.util.ArrayList;



public class ExtendTestUse {
	
	public static void main(String[] args) {
		ExtendTest extendTest = new ExtendTest();
		extendTest.put("hi", "test");
		Object object = extendTest.get("hi");
		
		ArrayList<String> arrayList = new ArrayList<>();
	}

}

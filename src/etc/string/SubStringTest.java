package etc.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubStringTest {

	@Test
	public void testName() throws Exception {
		
		String fileName = "test.png";
		printLastname(fileName);
		printLastname("test");
		printLastname("");
		
	}
	
	private void printLastname(String fileName){
		int lastIndexOf = fileName.lastIndexOf(".");
		System.out.println("lastIndex of :"+lastIndexOf);
		String ext = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println("ext: "+ext);
	}
	
	
}

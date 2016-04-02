package etc.lambda;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaExceptionTest {

	@Test
	public void testName() throws Exception {
		List<String> list = Arrays.asList("test", "2", "test3", "test4");
		
		list.forEach(n->{
			System.out.println(n);
			try{
				n.substring(0,3);
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("기네?");
			}
			
		});
	}
}

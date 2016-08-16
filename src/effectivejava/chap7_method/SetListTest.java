package effectivejava.chap7_method;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetListTest {

	@Test
	public void setListTest() throws Exception {
		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}
		for (int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove(i);
		}
		System.out.println(set + " " + list);
		
	}
}

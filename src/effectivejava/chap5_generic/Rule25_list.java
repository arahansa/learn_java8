package effectivejava.chap5_generic;

import java.util.ArrayList;
import java.util.List;

public class Rule25_list {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		unsafeAdd(strings, new Integer(42));
		String s = strings.get(0);
	}

	private static void unsafeAdd(List<?> list, Object integer) {
		// list.add(integer);
	}
}

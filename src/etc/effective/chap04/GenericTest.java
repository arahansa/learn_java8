package etc.effective.chap04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericTest {

	
	public static void main(String[] args) {
		Set<String> guys= new HashSet<>(Arrays.asList("Tom", "Dick", "TT"));
		Set<String> guys2= new HashSet<>(Arrays.asList("Tom", "Dick", "TT"));
		Set<Integer> inte = new HashSet<>(Arrays.asList(1, 2, 3));
		// union(guys, inte);
	}
	
	public static <E> Set<E> union(Set<E> e1, Set<E> s2){
		Set<E> result  = new HashSet<>();
		result.addAll(s2);
		return result;
	}
	
	
}

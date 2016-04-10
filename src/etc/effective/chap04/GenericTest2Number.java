package etc.effective.chap04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericTest2Number {

	
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<>(Arrays.asList(1,2,3));
		Set<Double> doubles = new HashSet<>(Arrays.asList(1.1 , 1.2));
		Set<? extends Number> union = union(integers, doubles);
	}
	
	public static <E> Set<E> union(Set<? extends E> e1, Set<? extends E> s2){
		Set<E> result  = new HashSet<>();
		result.addAll(s2);
		return result;
	}
	
}

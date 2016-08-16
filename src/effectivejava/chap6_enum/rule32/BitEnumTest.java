package effectivejava.chap6_enum.rule32;

import java.util.EnumSet;
import java.util.Set;

public class BitEnumTest {

	public static void main(String[] args) {
		bitParameterTest(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
	
	public static void bitParameterTest(Set<Style> styles){
		System.out.println("Sets : "+styles);
	}
}

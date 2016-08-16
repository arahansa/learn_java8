package effectivejava.chap6_enum.rule32;

public class BitParameterTest {

	public static final int a = 1;
	public static final int b = 2;
	public static final int c = 4;
	public static final int d = 8;
	
	public static void main(String[] args) {
		bitParameterTest(a|b);
		bitParameterTest(b|c);
		bitParameterTest(b|d);
	}
	
	public static void bitParameterTest(int a){
		System.out.println("bit param  : "+ a);
	}
}

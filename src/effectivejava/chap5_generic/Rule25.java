package effectivejava.chap5_generic;

public class Rule25 {

	public static void main(String[] args) {
		Object[] objectArray = new Long[1];
		
		objectArray[0] = "I don't fit in";
		System.out.println("object : "+objectArray[0]); //error
	}
	
	
}

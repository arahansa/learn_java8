package effectivejava.chap6_enum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jarvis on 16. 4. 10..
 */
public enum  OperationOld {
    PLUS, MINUS, TIMES, DIVIDE;

    double apply(double x, double y){
        switch (this){
            case PLUS : return  x + y;
            case MINUS : return x - y;
            case TIMES : return x * y;
            case DIVIDE : return x / y;
        }
        throw new AssertionError("Unknown op : " + this);
    }
    
    private static final Map<String, OperationOld> stringToEnum = 
    		new HashMap<>();
    
    private OperationOld() {
    	
	}
    
}

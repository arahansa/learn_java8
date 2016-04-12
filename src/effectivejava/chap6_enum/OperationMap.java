package effectivejava.chap6_enum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jarvis on 16. 4. 11..
 */
public enum  OperationMap {

    PLUS("+"){ double apply(double x, double y){return x + y;} },
    MINUS("-"){ double apply(double x, double y){return x - y;} },
    TIMES("*"){ double apply(double x, double y){return x * y;} },
    DIVIDE("/"){ double apply(double x, double y){return x / y;} };

    private final String symbol;
    OperationMap(String symbol){this.symbol = symbol;}

    abstract double apply(double x, double y);

    private static final Map<String, OperationMap> stringToEnum = new HashMap<>();

    static{
      for(OperationMap opm : values()){
          stringToEnum.put(opm.toString(), opm);
      }
    }

    public static OperationMap fromString(String symbol){
        return stringToEnum.get(symbol);
    }
}

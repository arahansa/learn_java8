package effectivejava.chap6_enum;

/**
 * Created by jarvis on 16. 4. 10..
 */
public enum OperationConstant {
    PLUS("+"){ double apply(double x, double y){return x + y;} },
    MINUS("-"){ double apply(double x, double y){return x - y;} },
    TIMES("*"){ double apply(double x, double y){return x * y;} },
    DIVIDE("/"){ double apply(double x, double y){return x / y;} };

    private final String symbol;
    OperationConstant(String symbol){this.symbol = symbol;}

    @Override
    public String toString(){
        return symbol;
    }

    abstract double apply(double x, double y);
}

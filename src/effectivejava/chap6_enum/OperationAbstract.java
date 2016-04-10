package effectivejava.chap6_enum;

/**
 * Created by jarvis on 16. 4. 10..
 */
public enum  OperationAbstract {

    PLUS {double apply(double x, double y) {return x+y;}},
    MINUS{double apply(double x, double y) {return x-y;}},
    TIMES{double apply(double x, double y) {return x*y;}},
    DIVIDE{double apply(double x, double y) {return x/y;}};

    abstract double apply(double x, double y);
}

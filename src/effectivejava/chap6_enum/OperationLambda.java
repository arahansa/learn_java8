package effectivejava.chap6_enum;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by arahansa on 2016-04-10.
 */
public enum OperationLambda {
    PLUS((x, y) -> x + y),
    MINUS((x, y) -> x - y),
    TIMES((x, y) -> x * y),
    DIVIDE((x, y) -> x / y);

    private final DoubleBinaryOperator operation;

    OperationLambda(final DoubleBinaryOperator operation) {
        this.operation = operation;
    }

    public double apply(double x, double y) {
        return operation.applyAsDouble(x, y);
    }
}

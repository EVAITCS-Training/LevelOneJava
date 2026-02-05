import java.util.Objects;
import java.util.function.BinaryOperator;

public class Calculator<T extends Number> {

    private final T identity;
    private final BinaryOperator<T> adder;

    public Calculator(T identity, BinaryOperator<T> adder) {
        this.identity = Objects.requireNonNull(identity);
        this.adder = Objects.requireNonNull(adder);
    }

    public T add(T... args) {
        T result = identity;
        for(T i : args) {
            result = adder.apply(result, i);
        }

        return result;
    }
}

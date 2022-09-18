
import java.util.function.*;

public class Calculator {
    int val;

    int Calculator() {
        return val;
    }

    int getVal() {
        return val;
    }

    static Supplier<Calculator> instance = () -> new Calculator();


    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x * x;

    Predicate<Integer> isPositiv = x -> x > 0;

    Consumer<Integer> println = System.out::println;


    public void println(int y) {
        System.out.println(y);
    }
}






public class Main {


    public static void main(String[] args) {


        Calculator calc = Calculator.instance.get();
        int y = calc.plus.apply(1, 2);
        calc.println(y);
        int z = calc.minus.apply(3, 2);
        calc.println(z);


    }
}

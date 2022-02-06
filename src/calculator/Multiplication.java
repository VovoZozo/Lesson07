package calculator;

public class Multiplication implements Operation {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}

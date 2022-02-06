package calculator;

public class Plus implements Operation {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

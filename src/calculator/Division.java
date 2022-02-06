package calculator;

public class Division implements Operation {
    @Override
    public void calculate(int a, int b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }
}

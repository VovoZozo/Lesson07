package calculator;

public class Subtracting implements Operation {

    @Override
    public void calculate(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}

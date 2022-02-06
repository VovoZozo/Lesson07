package calculator;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Hi");
        run();
        System.out.println("Buy");
    }

    private void run() {
        while (true) {
            Operation operation = select();
            if (operation == null) {
                break;
            }
            System.out.println("Введите первый аргумент");
            int firstArg = scanner.nextInt();
            System.out.println("Введите второй аргумент");
            int secondArg = scanner.nextInt();
            operation.calculate(firstArg, secondArg);
        }
    }

    private Operation select() {
        showMenu();
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                return new Plus();
            case 2:
                return new Subtracting();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();
            case 0:
                return null;
        }
        System.out.println("нет  такой операции");
        return select();
    }

    private void showMenu() {
        System.out.println("Выберите операцию");
        System.out.println("1-сложение");
        System.out.println("2-вычитание");
        System.out.println("3-умножение");
        System.out.println("4-деление");
        System.out.println("0-выход");
    }
}

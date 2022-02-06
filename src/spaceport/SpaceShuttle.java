package spaceport;

import java.util.Random;

public class SpaceShuttle extends Rocket {

    @Override
    public boolean check() {
        Random random = new Random();
        int value = random.nextInt(10);
        System.out.println("Предстартовая проверка Space Shuttle");
        if (value > 3) {
            System.out.println(getClass().getName() + " - Успешно");
            return true;
        } else {
            System.out.println(getClass().getName() + " - ЗАПУСК НЕ ВОЗМОЖЕН");
            return false;
        }
    }

    @Override
    public void motorStart() {
        System.out.println(getClass().getName() + " - Запуск двигателей");

    }

    @Override
    public void start() {
        System.out.println(getClass().getName() + " - Полетели!!!");
    }
}

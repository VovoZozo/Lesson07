package avtodrom;

import java.util.Random;

public class Car {
    private String name;
    private int speed;
    private int price;
    private Engine engine;
    private Gearbox gearbox;
    private boolean isStarted = false;

    public Car(String name, int speed, int price, Engine engine, Gearbox gearbox) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("=======================");
        if (isStarted) {
            System.out.println(name + "  и так уже запущен");
            return;
        }
        if (checkSystem()) {
            engine.start();
            System.out.println(name + " запустился");
            isStarted = true;
            gearbox.speedUp();
        } else {
            System.out.println(name + "  сломался");
        }
        System.out.println("===================");
    }

    public void stop() {
        if (isStarted) {
            gearbox.resetSpeed();
            System.out.println(name + " остановился");
            isStarted = false;
        } else {
            System.out.println(name + " еще не запускался");
        }
    }

    private boolean checkSystem() {
        System.out.println("Предстартовая проверка для " + name);
        Random random = new Random();
        int value = random.nextInt(100);
        return value % 2 == 0;
    }

    public void speedUp() {
        gearbox.speedUp();
    }

    public void speedDown() {
        gearbox.speedDown();
    }

    public void reverseSpeed() {
        gearbox.reverseSpeed();
    }

    public void resetSpeed() {
        gearbox.resetSpeed();
    }

}

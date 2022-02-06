package avtodrom;

public class DieselEngine extends Engine {
    public DieselEngine(int power) {
        super(power);
    }

    public DieselEngine() {
    }

    public void start() {
        System.out.println("Качаю солярку");
        System.out.println("Дизельный двигатель запустился " + getPower());
    }

}

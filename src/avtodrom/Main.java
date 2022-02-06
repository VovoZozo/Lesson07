package avtodrom;

public class Main {
    public static void main(String[] args) {
        ManualGearbox gearbox1 = new ManualGearbox("6-Speed MT", 6);
        ManualGearbox gearbox2 = new ManualGearbox("6-Speed MT", 4);
        ManualGearbox gearbox3 = new ManualGearbox("6-Speed MT", 5);
        AutomaticGearbox gearbox4 = new AutomaticGearbox("Variable AT");
        RobotGearbox gearbox5 = new RobotGearbox("AMT");

        PetrolEngine petrolEngine1 = new PetrolEngine(230, "АИ-98");
        PetrolEngine petrolEngine2 = new PetrolEngine(170, "АИ-95");
        PetrolEngine petrolEngine3 = new PetrolEngine(400, "АИ-98");

        DieselEngine dieselEngine1 = new DieselEngine(190);
        DieselEngine dieselEngine2 = new DieselEngine(120);

        Car car1 = new Car("Audi", 250, 27500, petrolEngine1, gearbox1);
        Car car2 = new Car("BMW", 280, 32400, dieselEngine1, gearbox2);
        Car car3 = new Car("Volvo", 300, 29500, petrolEngine2, gearbox3);
        Car car4 = new Car("Mazda", 180, 15000, petrolEngine3, gearbox4);
        Car car5 = new Car("Citroen", 190, 9000, dieselEngine2, gearbox5);

        car1.start();
        car1.speedDown();
        car1.resetSpeed();
        car1.reverseSpeed();
        car1.speedUp();
        car1.stop();

        car2.start();
        car2.speedDown();
        car2.resetSpeed();
        car2.reverseSpeed();
        car2.speedUp();
        car2.stop();

        car3.start();
        car3.speedDown();
        car3.resetSpeed();
        car3.reverseSpeed();
        car3.speedUp();
        car3.stop();

        car4.start();
        car4.speedDown();
        car4.resetSpeed();
        car4.reverseSpeed();
        car4.speedUp();
        car4.stop();

        car5.start();
        car5.speedDown();
        car5.resetSpeed();
        car5.reverseSpeed();
        car5.speedUp();
        car5.stop();
    }
}

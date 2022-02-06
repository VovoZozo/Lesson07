package avtodrom;

public class PetrolEngine extends Engine {

    private String fuel;

    public PetrolEngine(int power, String fuel) {
        super(power);
        this.fuel = fuel;
    }

    public PetrolEngine() {
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void start() {
        System.out.println("Качаю бензин " + fuel);
        System.out.println("Даю искру");
        System.out.println("Стартер крутит");
        System.out.println("Бензиновый двигатель завелся " + getPower());
    }
}

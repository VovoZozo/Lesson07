package avtodrom;

public abstract class Gearbox {

    private String type;

    public Gearbox(String type) {
        this.type = type;
    }

    public Gearbox() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void speedUp();

    public abstract void speedDown();

    public abstract void reverseSpeed();

    public abstract void resetSpeed();

}

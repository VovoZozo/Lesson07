package avtodrom;

public class ManualGearbox extends Gearbox {
    private int maxStage;
    private int speedCounter;

    public ManualGearbox(String type, int maxStage) {
        super(type);
        this.maxStage = maxStage;
        speedCounter = 0;
    }

    public ManualGearbox() {
    }

    public int getSpeedCounter() {
        return speedCounter;
    }

    public void setSpeedCounter(int speedCounter) {
        this.speedCounter = speedCounter;
    }

    public int getMaxStage() {
        return maxStage;
    }

    public void setMaxStage(int maxStage) {
        this.maxStage = maxStage;
    }

    public void speedUp() {
        if (speedCounter < maxStage && speedCounter >= 0) {
            speedCounter++;
            System.out.println(getType() + " - включена передача " + speedCounter);
        } else if (speedCounter == maxStage) {
            System.out.println(getType() + " - текущая передача максимальная " + speedCounter);
        } else {
            resetSpeed();
        }
    }

    public void resetSpeed() {
        if (speedCounter != 0) {
            speedCounter = 0;
            System.out.println(getType() + " -  выключена");
        } else {
            System.out.println(getType() + " -  и так уже выключена");
        }
    }

    public void speedDown() {
        if (speedCounter > 1) {
            speedCounter--;
            System.out.println(getType() + " - включена передача " + speedCounter);
        } else {
            resetSpeed();
        }
    }

    public void reverseSpeed() {
        if (speedCounter != -1) {
            speedCounter = -1;
            System.out.println(getType() + " включена задняя передача");
        } else {
            System.out.println("Задняя передача уже была включена");
        }
    }
}

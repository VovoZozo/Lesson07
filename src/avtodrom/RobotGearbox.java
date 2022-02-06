package avtodrom;

public class RobotGearbox extends Gearbox {

    private char currentState = 'N';

    public RobotGearbox(String type) {
        super(type);
    }

    public RobotGearbox() {
    }

    public void speedUp() {
        switchState('D');
    }

    public void resetSpeed() {
        switchState('N');
    }

    public void speedDown() {
        switchState('N');
    }

    public void reverseSpeed() {
        switchState('R');
    }

    public void parking() {
        switchState('P');
    }

    private void switchState(char state) {
        if (currentState != state) {
            System.out.println(getType() + " - установлен режим " + state);
            currentState = state;
        } else {
            System.out.println(getType() + " - режим " + state + " уже установлен");
        }
    }
}

package avtodrom;

public class AutomaticGearbox extends Gearbox {
    private char currentState;

    public AutomaticGearbox(String type) {
        super(type);
        currentState = 'N';
    }

    public AutomaticGearbox() {
    }

    public char getCurrentState() {
        return currentState;
    }

    public void setCurrentState(char currentState) {
        this.currentState = currentState;
    }

    public void speedUp() {
        switchState('D');
    }

    public void resetSpeed() {
        switchState('N');
    }

    public void speedDown() {
        switchState('L');
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

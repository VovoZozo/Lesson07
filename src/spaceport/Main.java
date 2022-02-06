package spaceport;

public class Main {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.rocketStart(new FalconHeavy());
        spaceport.rocketStart(new SpaceShuttle());
        spaceport.rocketStart(new Union());
    }
}

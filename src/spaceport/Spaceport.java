package spaceport;

public class Spaceport {
    public void rocketStart(Rocket rocket) {
        if (rocket.check()) {
            rocket.motorStart();
            int count = 10;
            while (count > 0) {
                System.out.println(count);
                count--;
            }
            rocket.start();
        }
        System.out.println("------------------------------");
    }
}

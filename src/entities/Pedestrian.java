package entities;

public class Pedestrian {
    private String location;
    private boolean isCrossing;
    private int speed;

    public Pedestrian(String location, int speed) {
        this.location = location;
        this.isCrossing = false;
        this.speed = speed;
    }

    public void startCrossing() {
        this.isCrossing = true;
        System.out.println("Pedestrian is crossing at " + location + " with a speed of " + speed + " m/s.");
    }

    public void stopCrossing() {
        this.isCrossing = false;
        System.out.println("Pedestrian has stopped crossing at " + location + ".");
    }
}

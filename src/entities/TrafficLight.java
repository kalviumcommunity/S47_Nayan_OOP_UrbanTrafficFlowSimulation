package entities;

public class TrafficLight {
    // Attributes
    private String location;
    private String lightColor;
    private int duration;  // Duration in seconds

    // Constructor
    public TrafficLight(String location, String lightColor, int duration) {
        this.location = location;
        this.lightColor = lightColor;
        this.duration = duration;
    }

    // Method to display the current light status
    public void displayLightStatus() {
        System.out.println("Traffic Light at " + location + ": " + lightColor + " for " + duration + " seconds.");
    }

    // Method to change the light color and its duration
    public void changeLight(String newColor, int newDuration) {
        this.lightColor = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light at " + location + " changed to " + lightColor + " for " + duration + " seconds.");
    }
}

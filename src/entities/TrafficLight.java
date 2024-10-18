package entities;

public class TrafficLight {
    // Static variable to keep track of the total number of traffic lights created
    private static int totalTrafficLights = 0;

    // Instance variables
    private String location;
    private String lightColor;
    private int duration;  // Duration in seconds

    // Constructor
    public TrafficLight(String location, String lightColor, int duration) {
        this.location = location;
        this.lightColor = lightColor;
        this.duration = duration;
        totalTrafficLights++;  // Increment static counter whenever a new traffic light is created
    }

    // Static method to get the total number of traffic lights
    public static int getTotalTrafficLights() {
        return totalTrafficLights;
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

    // Getter for the light color
    public String getLightColor() {
        return lightColor;
    }
}

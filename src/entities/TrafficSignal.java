package entities;

public class TrafficSignal {
    // Attributes
    private String color;
    private int duration; // Duration in seconds

    // Constructor
    public TrafficSignal(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to display the current signal status
    public void displayStatus() {
        System.out.println("Current Signal: " + color);
        System.out.println("Duration: " + duration + " seconds");
    }

    // Method to change the signal color
    public void changeSignal(String newColor) {
        this.color = newColor;
        System.out.println("Traffic signal changed to: " + color);
    }
}

package entities;

public class Vehicle {
    // Attributes
    private String type;
    private int speed;

    // Constructor
    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to simulate vehicle movement
    public void move() {
        System.out.println(type + " is moving at " + speed + " km/h.");
    }
}

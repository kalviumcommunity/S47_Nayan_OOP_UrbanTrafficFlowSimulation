package entities;

public class Vehicle {
    // Attributes
    private String type;
    private int speed;
    
    // Private constant for maximum speed
    private static final int MAX_SPEED = 120;

    // Constructor
    public Vehicle(String type, int speed) {
        this.type = type;
        // Ensure the initial speed is within the limit
        if (speed <= MAX_SPEED) {
            this.speed = speed;
        } else {
            this.speed = MAX_SPEED;
            System.out.println("Initial speed exceeds max limit. Setting speed to " + MAX_SPEED + " km/h.");
        }
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

    // Method to change the vehicle speed within the limit
    public void setSpeed(int newSpeed) {
        if (newSpeed <= MAX_SPEED) {
            this.speed = newSpeed;
            System.out.println(type + " speed set to " + speed + " km/h.");
        } else {
            System.out.println("Error: Speed exceeds the maximum limit of " + MAX_SPEED + " km/h.");
        }
    }
}

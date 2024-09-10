package entities;

public class Vehicle {
    // Attributes
    private String type;
    private int speed;
    
    // Private constant for maximum speed
    private static final int MAX_SPEED = 120;

    // Constructor using `this` pointer to resolve naming conflict
    public Vehicle(String type, int speed) {
        this.type = type;  // 'this' refers to the instance variable
        if (speed <= MAX_SPEED) {
            this.speed = speed;  // 'this' refers to the instance variable
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

    // Method to change the vehicle speed using `this` pointer
    public void setSpeed(int speed) {
        if (speed <= MAX_SPEED) {
            this.speed = speed;  // 'this' refers to the instance variable
            System.out.println(this.type + " speed set to " + this.speed + " km/h.");
        } else {
            System.out.println("Error: Speed exceeds the maximum limit of " + MAX_SPEED + " km/h.");
        }
    }
}

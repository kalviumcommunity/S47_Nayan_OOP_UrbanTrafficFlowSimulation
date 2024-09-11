package entities;

public abstract class Vehicle {
    // Attributes
    private String type;
    private int speed;
    private int maxSpeed;  // Each vehicle has its own max speed

    // Constructor using `this` pointer to resolve naming conflict
    public Vehicle(String type, int speed, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;  // Set the max speed for this vehicle
        if (speed <= maxSpeed) {
            this.speed = speed;
        } else {
            this.speed = maxSpeed;
            System.out.println("Initial speed exceeds max limit. Setting speed to " + maxSpeed + " km/h.");
        }
    }

    // Getter for type
    public String getType() {
        return this.type;
    }

    // Getter for speed
    public int getSpeed() {
        return this.speed;
    }

    // Getter for maxSpeed
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // Getter for model
    public abstract String getModel();

    // Method to simulate vehicle movement
    public void move() {
        System.out.println(type + " is moving at " + speed + " km/h.");
    }

    // Method to change the vehicle speed using `this` pointer
    public void setSpeed(int speed) {
        if (speed <= maxSpeed) {
            this.speed = speed;
            System.out.println(this.type + " speed set to " + this.speed + " km/h.");
        } else {
            System.out.println("Error: Speed exceeds the maximum limit of " + maxSpeed + " km/h.");
        }
    }
        // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Speed: " + speed + " km/h");
    }
}

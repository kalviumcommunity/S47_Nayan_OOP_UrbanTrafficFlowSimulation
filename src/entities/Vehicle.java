package entities;

public abstract class Vehicle {
    // Attributes
    private String type;
    private int speed;
    private int maxSpeed;  // Each vehicle has its own max speed

    // Static variable
    private static int totalVehicles = 0;  // Counts the total number of vehicles created

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

        // Increment static variable for each vehicle created
        totalVehicles++;
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

    // Abstract method to be implemented by subclasses to return the model
    public abstract String getModel();

    // Method to change the vehicle speed, enforce speed limit with TrafficRule
    public void setSpeed(int speed, TrafficRule rule) {
        if (rule != null) {
            this.speed = speed;
            rule.enforceRule(this);  // Call the enforce rule method
        }

        else if (speed <= maxSpeed) {
            this.speed = speed;
            System.out.println(this.type + " speed set to " + this.speed + " km/h.");
        } else {
            System.out.println("Error: Speed exceeds the maximum limit of " + maxSpeed + " km/h.");
        }
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Model: " + getModel());
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    // Static method to get the total number of vehicles created
    public static int getTotalVehicles() {
        return totalVehicles;
    }
}

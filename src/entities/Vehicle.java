package entities;

public abstract class Vehicle {
    // Attributes
    private String type;
    private int speed;
    private SpeedController speedController;

    // Static variable
    private static int totalVehicles = 0;  // Counts the total number of vehicles created

    // Constructor using `this` pointer to resolve naming conflict
    public Vehicle(String type, int speed, int maxSpeed) {
        this.type = type;
        this.speedController = new SpeedController(maxSpeed);
        this.speed = speedController.validateAndGetSpeed(speed);
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

    // Abstract method to be implemented by subclasses to return the model
    public abstract String getModel();

    // Method to change the vehicle speed, enforce speed limit with TrafficRule
    public void setSpeed(int speed, TrafficRule rule) {
        if (rule != null) {
            // Get the validated speed after applying traffic rules
            this.speed = speedController.enforceSpeedLimit(this, speed, rule);
        }
    }

    // Method to change speed without traffic rule
    public void setSpeed(int speed) {
        this.speed = speedController.validateAndGetSpeed(speed);
        System.out.println(this.type + " speed set to " + this.speed + " km/h.");
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Model: " + getModel());
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Max Speed: " + speedController.getMaxSpeed() + " km/h");
    }

    // Static method to get the total number of vehicles created
    public static int getTotalVehicles() {
        return totalVehicles;
    }
}

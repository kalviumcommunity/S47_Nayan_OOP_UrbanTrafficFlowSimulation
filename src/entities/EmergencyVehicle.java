package entities;

public class EmergencyVehicle extends Vehicle {
    // Static variable to count the total number of emergency vehicles
    private static int totalEmergencyVehicles = 0;

    // Emergency vehicle-specific attributes
    private String emergencyType;  // e.g., Ambulance, Fire Truck

    // Constructor
    public EmergencyVehicle(String model, int speed, int maxSpeed, String emergencyType) {
        super(model, speed, maxSpeed);  // Call to the superclass constructor
        this.emergencyType = emergencyType;
        totalEmergencyVehicles++;  // Increment total number of emergency vehicles
    }

    // Getter for emergencyType
    public String getEmergencyType() {
        return this.emergencyType;
    }

    // Overriding the abstract method getModel() from Vehicle class
    @Override
    public String getModel() {
        return this.getEmergencyType();  // The emergencyType represents the model for emergency vehicles
    }

    // Overriding the move method to prioritize emergency vehicles
    // @Override
    public void move() {
        System.out.println(emergencyType + " is moving with priority at speed: " + getSpeed() + " km/h.");
    }

    // Static method to get the total number of emergency vehicles created
    public static int getTotalEmergencyVehicles() {
        return totalEmergencyVehicles;
    }

    // Method to display emergency vehicle details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Emergency Vehicle Type: " + emergencyType);
    }
}

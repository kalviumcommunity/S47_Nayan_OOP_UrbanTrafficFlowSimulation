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

    // Method overloading to demonstrate polymorphism

    // Basic emergency response
    public void respondToEmergency() {
        System.out.println(emergencyType + " responding to emergency!");
        this.setSpeed(this.getMaxSpeed());
    }

    // Emergency response with specific location
    public void respondToEmergency(String location) {
        System.out.println(emergencyType + " responding to emergency at location: " + location);
        this.setSpeed(this.getMaxSpeed());
    }

    // Emergency response with location and severity level
    public void respondToEmergency(String location, int severityLevel) {
        System.out.println(emergencyType + " responding to level " + severityLevel + " emergency at location: " + location);
        this.setSpeed(this.getMaxSpeed());
        if (severityLevel > 8) {
            System.out.println("CRITICAL EMERGENCY! Alerting all nearby units.");
        }
    }

    // Emergency response with location, severity, and additional units needed
    public void respondToEmergency(String location, int severityLevel, int additionalUnitsNeeded) {
        System.out.println(emergencyType + " responding to level " + severityLevel + " emergency at location: " + location);
        System.out.println("Requesting " + additionalUnitsNeeded + " additional units for backup.");
        this.setSpeed(this.getMaxSpeed());
    }
}

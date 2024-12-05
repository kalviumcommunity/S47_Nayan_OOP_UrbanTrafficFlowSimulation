package entities;

public class FireTruck extends EmergencyVehicle implements VehicleMonitor {
    private int waterCapacity;
    private boolean isPumpActive;

    public FireTruck(String model, int speed, int maxSpeed, int waterCapacity) {
        super(model, speed, maxSpeed, "FireTruck");
        this.waterCapacity = waterCapacity;
        this.isPumpActive = false;
    }

    public void activateWaterPump() {
        this.isPumpActive = true;
        System.out.println("Water pump activated! Ready to fight fire.");
    }

    public void deactivateWaterPump() {
        this.isPumpActive = false;
        System.out.println("Water pump deactivated.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking FireTruck status...");
        System.out.println("Water Capacity: " + waterCapacity + " liters");
        System.out.println("Pump Status: " + (isPumpActive ? "Active" : "Inactive"));
    }

    @Override
    public String getHealthStatus() {
        return "FireTruck " + getModel() + " - Water capacity: " + waterCapacity + "L";
    }

    @Override
    public void logVehicleData() {
        System.out.println("Logging fire truck data...");
        System.out.println("Vehicle ID: " + getModel());
        System.out.println("Water Capacity: " + waterCapacity + " liters");
        System.out.println("Pump Status: " + (isPumpActive ? "Active" : "Inactive"));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Water Capacity: " + waterCapacity + " liters");
        System.out.println("Pump Status: " + (isPumpActive ? "Active" : "Inactive"));
    }

    @Override
    public void respondToEmergency() {
        activateWaterPump();
        this.setSpeed(this.getMaxSpeed());
        System.out.println("FireTruck is responding to a fire emergency at full speed!");
    }
}

package entities;

public abstract class FuelMonitor {
    // Abstract method for fuel efficiency monitoring
    public abstract void monitorFuelEfficiency(Vehicle vehicle);

    // Shared method to display fuel efficiency logs
    public void logFuelUsage(String message) {
        System.out.println("Fuel Log: " + message);
    }
}

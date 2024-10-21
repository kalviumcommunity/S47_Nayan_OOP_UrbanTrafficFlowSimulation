package entities;

public class CarFuelMonitor extends FuelMonitor {
    @Override
    public void monitorFuelEfficiency(Vehicle vehicle) {
        double efficiency = calculateEfficiency(vehicle.getSpeed());
        logFuelUsage(vehicle.getType() + " has fuel efficiency of " + efficiency + " km/l.");
    }

    // Specific method for cars to calculate fuel efficiency based on speed
    private double calculateEfficiency(int speed) {
        // Placeholder formula for fuel efficiency based on speed
        return 15.0 - (speed * 0.05);
    }
}

package entities;

public class SpeedLimitRule extends TrafficRule {
    private int speedLimit;

    public SpeedLimitRule(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public void enforceRule(Vehicle vehicle) {
        System.out.printf("speed limit %d", speedLimit);
        System.out.println("\nEnforcing speed limit rule...");
        System.out.println("vehicle speed: " + vehicle.getSpeed());
        if (vehicle.getSpeed() > speedLimit) {
            logViolation(vehicle.getType() + " exceeded the speed limit of " + speedLimit + " km/h.");
        } else {
            System.out.println(vehicle.getType() + " is within the speed limit.");
        }
    }

    // Method to get the speed limit
    public int getSpeedLimit() {
        return speedLimit;
    }
}

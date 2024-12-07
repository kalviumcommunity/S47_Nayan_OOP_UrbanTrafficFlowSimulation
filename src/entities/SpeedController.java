package entities;

public class SpeedController {
    private final int maxSpeed;

    public SpeedController(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int validateAndGetSpeed(int requestedSpeed) {
        if (requestedSpeed <= maxSpeed) {
            return requestedSpeed;
        } else {
            System.out.println("Speed exceeds max limit. Setting speed to " + maxSpeed + " km/h.");
            return maxSpeed;
        }
    }

    public int enforceSpeedLimit(Vehicle vehicle, int requestedSpeed, TrafficRule rule) {
        // First validate the speed against vehicle's max speed limit
        int validatedSpeed = validateAndGetSpeed(requestedSpeed);
        
        // Then apply any additional traffic rules if present
        if (rule != null && rule instanceof SpeedLimitRule) {
            SpeedLimitRule speedRule = (SpeedLimitRule) rule;
            rule.enforceRule(vehicle);  // Log the speed check
            
            // Enforce the speed limit
            if (validatedSpeed > speedRule.getSpeedLimit()) {
                System.out.println("Adjusting speed to comply with speed limit...");
                validatedSpeed = speedRule.getSpeedLimit();
            }
        }
        
        return validatedSpeed;  // Return the validated speed to be used by the vehicle
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

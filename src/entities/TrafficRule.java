package entities;

public abstract class TrafficRule {
    // Abstract method to be implemented by subclasses to enforce specific rules
    public abstract void enforceRule(Vehicle vehicle);

    // A method that could be shared between all subclasses
    public void logViolation(String message) {
        System.out.println("Violation logged: " + message);
    }
}

package entities;

public class Bus extends Vehicle {
    private String busModel;

    // Constructor with busModel, speed, and maxSpeed parameters
    public Bus(String busModel, int speed, int maxSpeed) {
        super("Bus", speed, maxSpeed);  // Pass "Bus", speed, and maxSpeed to the Vehicle constructor
        this.busModel = busModel;
    }

    // Getter for busModel
    @Override
    public String getModel() {
        return busModel;
    }

    // Overriding the getType method from Vehicle
    @Override
    public String getType() {
        return "Bus";
    }

    // Additional behavior specific to a Bus (for example, stop for passengers)
    public void stopForPassengers() {
        System.out.println("Bus is stopping for passengers.");
    }

}

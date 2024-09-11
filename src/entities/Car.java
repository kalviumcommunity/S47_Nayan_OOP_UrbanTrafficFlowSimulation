package entities;

public class Car extends Vehicle {
    private String model;

    // Constructor with model, speed, and maxSpeed parameters
    public Car(String model, int speed, int maxSpeed) {
        super("Car", speed, maxSpeed);  // Pass "Car", speed, and maxSpeed to the Vehicle constructor
        this.model = model;
    }

    // Getter for model
    @Override
    public String getModel() {
        return model;
    }

    // Overriding the getType method from Vehicle
    @Override
    public String getType() {
        return "Car";
    }

    // Additional behavior specific to a Car (for example, honk)
    public void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}

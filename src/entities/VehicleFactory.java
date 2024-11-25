package entities;

public class VehicleFactory implements AutoCloseable {
    private static int totalVehiclesCreated = 0;
    private String factoryName;
    private int factoryCapacity;
    private boolean isOperational;

    // Default Constructor
    public VehicleFactory() {
        this.factoryName = "Default Factory";
        this.factoryCapacity = 100;
        this.isOperational = true;
        System.out.println("Default Constructor: Created a new Vehicle Factory");
    }

    // Parameterized Constructor
    public VehicleFactory(String name, int capacity) {
        this.factoryName = name;
        this.factoryCapacity = capacity;
        this.isOperational = true;
        System.out.println("Parameterized Constructor: Created " + name + " factory with capacity " + capacity);
    }

    // Copy Constructor
    public VehicleFactory(VehicleFactory other) {
        this.factoryName = other.factoryName + " (Copy)";
        this.factoryCapacity = other.factoryCapacity;
        this.isOperational = other.isOperational;
        System.out.println("Copy Constructor: Created a copy of " + other.factoryName);
    }

    // Method to create vehicles
    public void createVehicle(String type) {
        if (totalVehiclesCreated < factoryCapacity && isOperational) {
            totalVehiclesCreated++;
            System.out.println("Created a new " + type + " vehicle at " + factoryName);
        } else if (!isOperational) {
            System.out.println("Factory is closed!");
        } else {
            System.out.println("Factory capacity reached!");
        }
    }

    // Getter methods
    public String getFactoryName() {
        return factoryName;
    }

    public int getFactoryCapacity() {
        return factoryCapacity;
    }

    public boolean isOperational() {
        return isOperational;
    }

    // Implementation of AutoCloseable interface
    @Override
    public void close() {
        if (isOperational) {
            System.out.println("Closing factory: " + factoryName + "\n");
            // In a real application, we would release system resources here
            // For example: closing database connections, file handles, etc.
            isOperational = false;
        }
    }
}
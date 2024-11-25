import simulation.TrafficManager;
import entities.Vehicle;
import entities.VehicleFactory;
import entities.Car;
import entities.EmergencyVehicle;
import entities.TrafficLight;
import entities.SpeedLimitRule;
import entities.CarFuelMonitor;

public class Main {
    public static void demonstrateConstructorsAndAutoCloseable() {
        System.out.println("\n=== Demonstrating Constructors and AutoCloseable ===\n");

        // 1. Using Default Constructor
        System.out.println("1. Creating factory with Default Constructor:");
        try (VehicleFactory defaultFactory = new VehicleFactory()) {
            defaultFactory.createVehicle("Sedan");
        } // AutoCloseable will automatically close the factory here

        // 2. Using Parameterized Constructor
        System.out.println("\n2. Creating factory with Parameterized Constructor:");
        try (VehicleFactory customFactory = new VehicleFactory("Custom Factory", 200)) {
            customFactory.createVehicle("SUV");
            customFactory.createVehicle("Truck");
        } // AutoCloseable will automatically close the factory here

        // 3. Using Copy Constructor
        System.out.println("\n3. Creating factory with Copy Constructor:");
        VehicleFactory originalFactory = new VehicleFactory("Original Factory", 150);
        try (VehicleFactory copiedFactory = new VehicleFactory(originalFactory)) {
            copiedFactory.createVehicle("Sports Car");
        } // AutoCloseable will automatically close the copied factory

        // 4. Demonstrating factory after closing
        System.out.println("\n4. Demonstrating closed factory behavior:");
        try (VehicleFactory factory = new VehicleFactory("Test Factory", 100)) {
            factory.createVehicle("Sedan"); // This will work
            factory.close(); // Explicitly closing
            factory.createVehicle("SUV");   // This won't work as factory is closed
            factory.getFactoryName();       // This won't work as factory is closed
        }
    }
    public static void main(String[] args) {

        demonstrateConstructorsAndAutoCloseable();
        // Create downtown factory
        VehicleFactory downtown = new VehicleFactory("Downtown", 200);
        downtown.createVehicle("Car");
        
        // When no longer needed
        downtown.close(); // Clean shutdown

        downtown.getFactoryCapacity(); // It won't work as factory is closed
        downtown.getFactoryName(); // It won't work as factory is closed




        // // Create a TrafficManager instance for 3 vehicles
        // TrafficManager manager = new TrafficManager(3);

        // // Create vehicle instances
        // Vehicle car = new Car("Sedan", 60, 120);
        // Vehicle ambulance = new EmergencyVehicle("Ambulance", 80, 150, "Emergency Response");
        
        // // Add vehicles to the traffic manager
        // manager.addVehicle(car, 0);
        // manager.addVehicle(ambulance, 1);

        // // Create and set a traffic light (red light by default)
        // TrafficLight trafficLight = new TrafficLight("Main Intersection", "Red", 30);
        // manager.setTrafficLight(trafficLight);

        // // Create and set a traffic rule (speed limit rule)
        // SpeedLimitRule speedLimitRule = new SpeedLimitRule(100);  // Speed limit set to 100 km/h
        // manager.setTrafficRule(speedLimitRule);

        // // Create and set a fuel monitor for fuel efficiency tracking
        // CarFuelMonitor carFuelMonitor = new CarFuelMonitor();
        // manager.setFuelMonitor(carFuelMonitor);

        // // Simulate traffic (this will apply both rules and fuel monitoring)
        // manager.simulateTraffic();

        // // Display all vehicle details at the end
        // manager.displayAllVehicles();

        // car.setSpeed(120, speedLimitRule);
    }
}

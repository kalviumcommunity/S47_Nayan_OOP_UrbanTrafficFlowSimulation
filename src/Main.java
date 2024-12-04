import simulation.TrafficManager;
import entities.Vehicle;
import entities.VehicleFactory;
import entities.Car;
import entities.EmergencyVehicle;
import entities.TrafficLight;
import entities.SpeedLimitRule;
import entities.CarFuelMonitor;
import entities.Ambulance;
import entities.FireTruck;
import entities.VehicleMonitor;

public class Main {
    // public static void demonstrateConstructorsAndAutoCloseable() {
    //     System.out.println("\n=== Demonstrating Constructors and AutoCloseable ===\n");

    //     // 1. Using Default Constructor
    //     System.out.println("1. Creating factory with Default Constructor:");
    //     try (VehicleFactory defaultFactory = new VehicleFactory()) {
    //         defaultFactory.createVehicle("Sedan");
    //     } // AutoCloseable will automatically close the factory here

    //     // 2. Using Parameterized Constructor
    //     System.out.println("\n2. Creating factory with Parameterized Constructor:");
    //     try (VehicleFactory customFactory = new VehicleFactory("Custom Factory", 200)) {
    //         customFactory.createVehicle("SUV");
    //         customFactory.createVehicle("Truck");
    //     } // AutoCloseable will automatically close the factory here

    //     // 3. Using Copy Constructor
    //     System.out.println("\n3. Creating factory with Copy Constructor:");
    //     VehicleFactory originalFactory = new VehicleFactory("Original Factory", 150);
    //     try (VehicleFactory copiedFactory = new VehicleFactory(originalFactory)) {
    //         copiedFactory.createVehicle("Sports Car");
    //     } // AutoCloseable will automatically close the copied factory

    //     // 4. Demonstrating factory after closing
    //     System.out.println("\n4. Demonstrating closed factory behavior:");
    //     try (VehicleFactory factory = new VehicleFactory("Test Factory", 100)) {
    //         factory.createVehicle("Sedan"); // This will work
    //         factory.close(); // Explicitly closing
    //         factory.createVehicle("SUV");   // This won't work as factory is closed
    //         factory.getFactoryName();       // This won't work as factory is closed
    //     }
    // }

    // public static void demonstrateInheritance() {
    //     System.out.println("\n=== Demonstrating Different Types of Inheritance ===\n");

    //     // 1. Hierarchical Inheritance (Vehicle -> Car)
    //     System.out.println("1. Hierarchical Inheritance Example:");
    //     Car sedan = new Car("Sedan", 60, 180);
    //     sedan.honk();
    //     System.out.println("Car Model: " + sedan.getModel());

    //     // 2. Multilevel Inheritance (Vehicle -> EmergencyVehicle -> Ambulance)
    //     System.out.println("\n2. Multilevel Inheritance Example:");
    //     Ambulance ambulance = new Ambulance("A-101", 80, 200, "City Hospital");
    //     ambulance.startEmergencyResponse();
    //     ambulance.move();
    //     ambulance.endEmergencyResponse();

    //     // 3. Interface Inheritance (VehicleMonitor interface implementation)
    //     System.out.println("\n3. Interface Inheritance Example:");
    //     FireTruck fireTruck = new FireTruck("FT-501", 70, 160, 5000);
    //     fireTruck.checkStatus();
    //     fireTruck.activateWaterPump();
    //     fireTruck.logVehicleData();
    // }

    public static void demonstratePolymorphism() {
        System.out.println("\n=== Demonstrating Polymorphism ===\n");

        // 1. Method Overloading (Compile-time Polymorphism)
        System.out.println("1. Method Overloading Example (Emergency Response):");
        Ambulance ambulance = new Ambulance("A-101", 0, 120, "City Hospital");
        FireTruck fireTruck = new FireTruck("F-201", 0, 100, 5000);

        System.out.println("\nTesting different emergency response scenarios:");
        ambulance.respondToEmergency(); // Basic response
        ambulance.respondToEmergency("Downtown"); // With location
        fireTruck.respondToEmergency("Shopping Mall", 9); // With location and high severity
        fireTruck.respondToEmergency("Factory District", 7, 3); // With additional units needed

        // 2. Method Overriding (Runtime Polymorphism)
        System.out.println("\n2. Method Overriding Example:");
        
        // Using Vehicle reference to demonstrate runtime polymorphism
        System.out.println("\nDisplaying vehicle details using Vehicle reference:");
        Vehicle vehicleRef1 = ambulance; // Vehicle reference pointing to Ambulance
        Vehicle vehicleRef2 = fireTruck; // Vehicle reference pointing to FireTruck
        
        vehicleRef1.displayDetails(); // Calls Ambulance's overridden version
        System.out.println();
        vehicleRef2.displayDetails(); // Calls FireTruck's overridden version

        // Using VehicleMonitor interface to demonstrate interface polymorphism
        System.out.println("\nDemonstrating interface polymorphism with VehicleMonitor:");
        VehicleMonitor monitor1 = ambulance; // VehicleMonitor reference pointing to Ambulance
        VehicleMonitor monitor2 = fireTruck; // VehicleMonitor reference pointing to FireTruck
        
        System.out.println("Ambulance Status:");
        monitor1.checkStatus();
        System.out.println("\nFireTruck Status:");
        monitor2.checkStatus();
    }

    public static void main(String[] args) {
        // demonstrateInheritance();
        demonstratePolymorphism();
        // demonstrateConstructorsAndAutoCloseable();

        // Create downtown factory
        // VehicleFactory downtown = new VehicleFactory("Downtown", 200);
        // downtown.createVehicle("Car");

        // // When no longer needed
        // downtown.close(); // Clean shutdown

        // downtown.getFactoryCapacity(); // It won't work as factory is closed
        // downtown.getFactoryName(); // It won't work as factory is closed

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

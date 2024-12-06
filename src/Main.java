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

    // public static void demonstratePolymorphism() {
    //     System.out.println("\n=== Demonstrating Polymorphism ===\n");

    //     // 1. Method Overloading (Compile-time Polymorphism)
    //     System.out.println("1. Method Overloading Example (Emergency Response):");
    //     Ambulance ambulance = new Ambulance("A-101", 0, 120, "City Hospital");
    //     FireTruck fireTruck = new FireTruck("F-201", 0, 100, 5000);

    //     System.out.println("\nTesting different emergency response scenarios:");
    //     ambulance.respondToEmergency(); // Basic response
    //     ambulance.respondToEmergency("Downtown"); // With location
    //     fireTruck.respondToEmergency("Shopping Mall", 9); // With location and high severity
    //     fireTruck.respondToEmergency("Factory District", 7, 3); // With additional units needed

    //     // 2. Method Overriding (Runtime Polymorphism)
    //     System.out.println("\n2. Method Overriding Example:");
        
    //     // Using Vehicle reference to demonstrate runtime polymorphism
    //     System.out.println("\nDisplaying vehicle details using Vehicle reference:");
    //     Vehicle vehicleRef1 = ambulance; // Vehicle reference pointing to Ambulance
    //     Vehicle vehicleRef2 = fireTruck; // Vehicle reference pointing to FireTruck
        
    //     vehicleRef1.displayDetails(); // Calls Ambulance's overridden version
    //     System.out.println();
    //     vehicleRef2.displayDetails(); // Calls FireTruck's overridden version

    //     // Using VehicleMonitor interface to demonstrate interface polymorphism
    //     System.out.println("\nDemonstrating interface polymorphism with VehicleMonitor:");
    //     VehicleMonitor monitor1 = ambulance; // VehicleMonitor reference pointing to Ambulance
    //     VehicleMonitor monitor2 = fireTruck; // VehicleMonitor reference pointing to FireTruck
        
    //     System.out.println("Ambulance Status:");
    //     monitor1.checkStatus();
    //     System.out.println("\nFireTruck Status:");
    //     monitor2.checkStatus();
    // }

    public static void main(String[] args) {
        demonstrateSingleResponsibilityPrinciple();
        // System.out.println("\n=== Understanding Abstract Classes and Virtual Functions in Traffic Simulation ===\n");

        // // Demonstrate why we can't instantiate an abstract class
        // System.out.println("1. Abstract Class Demonstration:");
        // System.out.println("- Cannot create EmergencyVehicle directly (it's abstract)");
        // System.out.println("- Must create specific types like Ambulance or FireTruck\n");

        // // Create concrete implementations
        // System.out.println("2. Creating Concrete Implementations:");
        
        // // Create an Ambulance
        // Ambulance ambulance = new Ambulance("A-101", 0, 120, "City Hospital");
        // System.out.println("Created Ambulance:");
        // ambulance.displayDetails();
        
        // // Create a FireTruck
        // FireTruck fireTruck = new FireTruck("F-201", 0, 100, 5000);
        // System.out.println("\nCreated FireTruck:");
        // fireTruck.displayDetails();

        // // Demonstrate virtual function (polymorphic behavior)
        // System.out.println("\n3. Virtual Function (respondToEmergency) Demonstration:");
        // System.out.println("- Each vehicle type implements emergency response differently:\n");
        
        // // Store vehicles in array of abstract type to demonstrate polymorphism
        // EmergencyVehicle[] vehicles = {ambulance, fireTruck};
        
        // for (EmergencyVehicle vehicle : vehicles) {
        //     System.out.println("Emergency Response for " + vehicle.getEmergencyType() + ":");
        //     vehicle.respondToEmergency();
        //     System.out.println();
        // }
        
    }

    public static void demonstrateSingleResponsibilityPrinciple() {
        System.out.println("\n=== Demonstrating Single Responsibility Principle (SRP) ===\n");
        
        // Create vehicles with different speed configurations
        Car sedan = new Car("Sedan", 60, 180);
        Ambulance ambulance = new Ambulance("A-101", 80, 200, "City Hospital");
        
        System.out.println("1. Demonstrating Speed Control Separation:");
        System.out.println("----------------------------------------");
        
        // Show how Vehicle class focuses on basic vehicle properties
        System.out.println("Initial Vehicle States:");
        sedan.displayDetails();
        System.out.println();
        ambulance.displayDetails();
        
        // Demonstrate speed control handled by SpeedController
        System.out.println("\n2. Testing Speed Control Logic:");
        System.out.println("------------------------------");
        
        // Try setting valid speed
        System.out.println("\nSetting valid speed for sedan (120 km/h):");
        sedan.setSpeed(120);
        
        // Try setting speed exceeding limit
        System.out.println("\nTrying to set speed exceeding limit for sedan (250 km/h):");
        sedan.setSpeed(250);
        
        // Demonstrate speed control with traffic rule
        System.out.println("\n3. Testing Speed Control with Traffic Rules:");
        System.out.println("----------------------------------------");
        
        SpeedLimitRule speedLimit = new SpeedLimitRule(100);  // 100 km/h speed limit
        System.out.println("\nApplying speed limit rule of 100 km/h to ambulance:");
        ambulance.setSpeed(150, speedLimit);
        
        System.out.println("\nFinal Vehicle States:");
        sedan.displayDetails();
        System.out.println();
        ambulance.displayDetails();
        
        System.out.println("\nThis demonstrates how SRP separates responsibilities:");
        System.out.println("1. Vehicle class: Manages basic vehicle properties");
        System.out.println("2. SpeedController class: Handles all speed-related operations");
        System.out.println("3. SpeedLimitRule class: Manages traffic rule enforcement");
    }
}

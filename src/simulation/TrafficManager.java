package simulation;

import entities.Vehicle;
import entities.EmergencyVehicle;
import entities.TrafficLight;
import entities.TrafficRule;
import entities.FuelMonitor;

public class TrafficManager {
    // Array to store multiple vehicles
    private Vehicle[] vehicles;
    // Reference to TrafficLight for simulation control
    private TrafficLight trafficLight;
    // Add TrafficRule and FuelMonitor references
    private TrafficRule trafficRule;
    private FuelMonitor fuelMonitor;

    // Constructor to initialize the array of vehicles
    public TrafficManager(int numVehicles) {
        vehicles = new Vehicle[numVehicles];  // Dynamically allocate the array of vehicles
    }

    // Method to add a vehicle to the array
    public void addVehicle(Vehicle vehicle, int index) {
        if (index < vehicles.length) {
            vehicles[index] = vehicle;  // Store vehicle dynamically in array
        } else {
            System.out.println("Index out of bounds: Cannot add vehicle.");
        }
    }

    // Method to assign a traffic light
    public void setTrafficLight(TrafficLight light) {
        this.trafficLight = light;
    }

    // Method to set the traffic rule (like speed limit)
    public void setTrafficRule(TrafficRule rule) {
        this.trafficRule = rule;
    }

    // Method to set the fuel monitor (for fuel efficiency)
    public void setFuelMonitor(FuelMonitor monitor) {
        this.fuelMonitor = monitor;
    }

    // Method to simulate traffic flow for all vehicles, prioritizing emergency vehicles
    public void simulateTraffic() {
        if (trafficLight != null) {
            trafficLight.displayLightStatus();
        }

        for (Vehicle v : vehicles) {
            if (v != null) {
                if (v instanceof EmergencyVehicle) {
                    // Emergency vehicles get priority and don't stop for traffic lights
                    System.out.println("Emergency vehicle (" + v.getType() + ") moving with priority!");
                } else {
                    // Non-emergency vehicles follow traffic light rules
                    if (trafficLight != null && "Green".equals(trafficLight.getLightColor())) {
                        System.out.println("Vehicle (" + v.getType() + ") moving through green light.");
                    } else {
                        System.out.println("Vehicle (" + v.getType() + ") is waiting at the red light.");
                    }
                }

                // Apply the traffic rule (enforce speed limits, etc.)
                if (trafficRule != null) {
                    trafficRule.enforceRule(v);  // Enforce specific rule based on the vehicle type
                }

                // Apply fuel efficiency monitoring (for demonstration)
                if (fuelMonitor != null) {
                    fuelMonitor.monitorFuelEfficiency(v);  // Monitor the fuel efficiency for each vehicle
                }

                System.out.println("---------------------");
            }
        }
    }

    // Method to display all vehicle details
    public void displayAllVehicles() {
        for (Vehicle v : vehicles) {
            if (v != null) {
                v.displayDetails();
                System.out.println("---------------------");
            }
        }
    }
}

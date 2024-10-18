package simulation;

import entities.Vehicle;
import entities.EmergencyVehicle;
import entities.TrafficLight;

public class TrafficManager {
    // Array to store multiple vehicles
    private Vehicle[] vehicles;

    // Reference to TrafficLight for simulation control
    private TrafficLight trafficLight;

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

// Method to simulate traffic flow for all vehicles, prioritizing emergency vehicles
public void simulateTraffic() {
    if (trafficLight != null) {
        trafficLight.displayLightStatus();
    }

    for (Vehicle v : vehicles) {
        if (v != null) {
            int newSpeed;

            if (v instanceof EmergencyVehicle) {
                // Emergency vehicles get priority and don't stop for traffic lights
                System.out.println("Emergency vehicle (" + v.getType() + ") moving with priority!");
                newSpeed = v.getMaxSpeed();  // Allow emergency vehicles to move at max speed
            } else {
                // Non-emergency vehicles follow traffic light rules
                if (trafficLight != null && "Green".equals(trafficLight.getLightColor())) {
                    System.out.println("Vehicle (" + v.getModel() + ") moving through green light.");
                } else {
                    System.out.println("Vehicle (" + v.getModel() + ") is waiting at the red light.");
                    newSpeed = 0;  // Non-emergency vehicles stop at red light
                    v.setSpeed(newSpeed); // Set stopped vehicle speed to 0
                    continue; // Skip further actions if stopped
                }

                // Set speed dynamically based on max speed limit
                newSpeed = Math.min(v.getMaxSpeed(), 70);  // Set speed to 70 km/h or the max speed of the vehicle, whichever is lower
            }

            // Apply new speed and print information
            v.setSpeed(newSpeed);
            System.out.println(v.getType() + " new speed: " + v.getSpeed() + " km/h.");
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

package simulation;

import entities.Vehicle;

public class TrafficManager {
    // Array to store multiple vehicles
    private Vehicle[] vehicles;

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

    // Method to simulate traffic flow for all vehicles
    public void simulateTraffic() {
        for (Vehicle v : vehicles) {
            if (v != null) {
                System.out.println("Vehicle Type: " + v.getType());
                System.out.println(v.getType()+ " model: " + v.getModel());
                System.out.println("Max Speed: " + v.getMaxSpeed() + " km/h");
                System.out.println("Current Speed: " + v.getSpeed() + " km/h");

                // Change speed for all vehicles
                v.setSpeed(70);  // Try to increase the speed
                System.out.println("New Speed: " + v.getSpeed() + " km/h");
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

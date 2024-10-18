import entities.TrafficLight;
import entities.Pedestrian;
import entities.Accident;
import entities.Vehicle;
import entities.Car;
import entities.EmergencyVehicle;
import simulation.TrafficManager;

public class Main {
    public static void main(String[] args) {
        // Creating TrafficManager
        TrafficManager trafficManager = new TrafficManager(4);

        // Dynamically creating Car and EmergencyVehicle objects
        trafficManager.addVehicle(new Car("Sedan", 50, 180), 0);
        trafficManager.addVehicle(new Car("SUV", 60, 160), 1);
        trafficManager.addVehicle(new EmergencyVehicle("Ambulance", 80, 200, "Ambulance"), 2);
        trafficManager.addVehicle(new EmergencyVehicle("Fire Truck", 70, 150, "Fire Truck"), 3);

        // Creating a TrafficLight
        TrafficLight trafficLight = new TrafficLight("Main St", "Red", 60);
        trafficManager.setTrafficLight(trafficLight);

        // Display the total number of traffic lights created
        System.out.println("Total Traffic Lights: " + TrafficLight.getTotalTrafficLights());

        // Simulate Traffic Flow
        trafficManager.simulateTraffic();

        // Display all vehicle details
        // System.out.println("\nDisplaying all vehicle details:");
        // trafficManager.displayAllVehicles();

        // Accident Simulation
        Vehicle[] affectedVehicles = {new Car("Sedan", 50, 180), new Car("SUV", 60, 160)};
        Accident accident = new Accident("Highway 23", "Major", affectedVehicles);
        accident.reportAccident();
    }
}

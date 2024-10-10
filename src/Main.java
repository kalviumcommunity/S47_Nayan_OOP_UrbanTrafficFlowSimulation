import entities.TrafficLight;
import entities.Pedestrian;
import entities.Accident;
import entities.Vehicle;
import entities.Car;
import simulation.TrafficManager;

public class Main {
    public static void main(String[] args) {
        // Creating TrafficManager dynamically with 3 lanes
        TrafficManager trafficManager = new TrafficManager(3);

        // Dynamically creating Car objects using static counter for vehicles
        trafficManager.addVehicle(new Car("Sedan", 50, 180), 0);  // Incrementing static vehicle counter
        trafficManager.addVehicle(new Car("SUV", 60, 160), 1);    // Incrementing static vehicle counter

        // Dynamic Traffic Light creation with static counter
        TrafficLight trafficLight1 = new TrafficLight("Main St", "Green", 60);
        trafficLight1.displayLightStatus();
        TrafficLight trafficLight2 = new TrafficLight("Crossing 5th Ave", "Red", 40);
        trafficLight2.displayLightStatus();

        // Display total number of vehicles and traffic lights created
        System.out.println("Total number of vehicles: " + Vehicle.getTotalVehicles());
        System.out.println("Total number of traffic lights: " + TrafficLight.getTotalTrafficLights());

        // Dynamic Pedestrian creation
        Pedestrian pedestrian = new Pedestrian("Crosswalk A", 5);
        pedestrian.startCrossing();

        // Accident Simulation
        Vehicle[] affectedVehicles = {new Car("Sedan", 50, 180), new Car("SUV", 60, 160)};
        Accident accident = new Accident("Highway 23", "Major", affectedVehicles);
        accident.reportAccident();

        // Simulate Traffic Flow
        trafficManager.simulateTraffic();

        // Display updated total number of vehicles after accident
        System.out.println("Total number of vehicles after accident: " + Vehicle.getTotalVehicles());
    }
}

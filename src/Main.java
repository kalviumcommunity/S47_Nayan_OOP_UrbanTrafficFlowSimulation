import entities.TrafficLight;
import entities.Pedestrian;
import entities.Accident;
import entities.Vehicle;
import entities.Car;
import simulation.*;

public class Main {
    public static void main(String[] args) {
        // Creating TrafficManager
        TrafficManager trafficManager = new TrafficManager(3);

        // Dynamically creating Car and Bus objects
        trafficManager.addVehicle(new Car("Sedan", 50, 180), 0);
        trafficManager.addVehicle(new Car("SUV", 60, 160), 1);

        // Dynamic Traffic Light creation
        TrafficLight trafficLight = new TrafficLight("Main St", "Green", 60);
        trafficLight.displayLightStatus();

        // Dynamic Pedestrian creation
        Pedestrian pedestrian = new Pedestrian("Crosswalk A", 5);
        pedestrian.startCrossing();

        // Accident Simulation
        Vehicle[] affectedVehicles = {new Car("Sedan", 50, 180), new Car("SUV", 60, 160)};
        Accident accident = new Accident("Highway 23", "Major", affectedVehicles);
        accident.reportAccident();

        // Simulate Traffic Flow
        trafficManager.simulateTraffic();
    }
}

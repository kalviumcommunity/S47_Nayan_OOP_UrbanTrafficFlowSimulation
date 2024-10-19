import simulation.TrafficManager;
import entities.Vehicle;
import entities.Car;
import entities.EmergencyVehicle;
import entities.TrafficLight;
import entities.SpeedLimitRule;
import entities.CarFuelMonitor;

public class Main {
    public static void main(String[] args) {
        // Create a TrafficManager instance for 3 vehicles
        TrafficManager manager = new TrafficManager(3);

        // Create vehicle instances
        Vehicle car = new Car("Sedan", 60, 120);
        Vehicle ambulance = new EmergencyVehicle("Ambulance", 80, 150, "Emergency Response");
        
        // Add vehicles to the traffic manager
        manager.addVehicle(car, 0);
        manager.addVehicle(ambulance, 1);

        // Create and set a traffic light (red light by default)
        TrafficLight trafficLight = new TrafficLight("Main Intersection", "Red", 30);
        manager.setTrafficLight(trafficLight);

        // Create and set a traffic rule (speed limit rule)
        SpeedLimitRule speedLimitRule = new SpeedLimitRule(100);  // Speed limit set to 100 km/h
        manager.setTrafficRule(speedLimitRule);

        // Create and set a fuel monitor for fuel efficiency tracking
        CarFuelMonitor carFuelMonitor = new CarFuelMonitor();
        manager.setFuelMonitor(carFuelMonitor);

        // Simulate traffic (this will apply both rules and fuel monitoring)
        manager.simulateTraffic();

        // Display all vehicle details at the end
        manager.displayAllVehicles();

        car.setSpeed(120, speedLimitRule);
    }
}

import entities.Car;
import entities.Bus;
import simulation.*;

public class Main {
    public static void main(String[] args) {
        // Create TrafficManager to handle 3 vehicles
        TrafficManager trafficManager = new TrafficManager(3);

        // Add different vehicles to the TrafficManager
        trafficManager.addVehicle(new Car("Sedan", 50, 180), 0);
        trafficManager.addVehicle(new Bus("CityBus", 30, 100), 1);
        trafficManager.addVehicle(new Car("SUV", 60, 160), 2);

        // Display vehicle details
        trafficManager.displayAllVehicles();

        // Simulate traffic flow
        trafficManager.simulateTraffic();
    }
}

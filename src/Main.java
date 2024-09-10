import entities.Vehicle;
import entities.TrafficSignal;

public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle car = new Vehicle("Car", 60);
        car.displayDetails();
        car.move();

        System.out.println(); // For readability

        // Change the speed within the limit
        car.setSpeed(80); // Valid speed
        car.move();

        System.out.println(); // For readability

        // Try to set speed above the limit
        car.setSpeed(150); // Exceeds the limit
        car.move();

        System.out.println(); // For readability

        // Creating a TrafficSignal object
        TrafficSignal signal = new TrafficSignal("Red", 30);
        signal.displayStatus();
        signal.changeSignal("Green");
        signal.displayStatus();
    }
}

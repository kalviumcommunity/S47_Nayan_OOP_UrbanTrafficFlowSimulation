import entities.Vehicle;
import entities.TrafficSignal;

public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle car = new Vehicle("Car", 60);
        car.displayDetails();
        car.move();

        System.out.println(); // For readability

        // Creating a TrafficSignal object
        TrafficSignal signal = new TrafficSignal("Red", 30);
        signal.displayStatus();
        signal.changeSignal("Green");
        signal.displayStatus();
    }
}

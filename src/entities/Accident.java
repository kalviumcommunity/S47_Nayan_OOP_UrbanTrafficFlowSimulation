package entities;

public class Accident {
    private String location;
    private String severity;
    private Vehicle[] affectedVehicles;  // Array of vehicles involved in the accident

    public Accident(String location, String severity, Vehicle[] affectedVehicles) {
        this.location = location;
        this.severity = severity;
        this.affectedVehicles = affectedVehicles;
    }

    public void reportAccident() {
        System.out.println("Accident reported at " + location + " with severity: " + severity);
        System.out.println("Affected vehicles:");
        for (Vehicle v : affectedVehicles) {
            v.displayDetails();
        }
    }
}

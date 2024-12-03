package entities;

public class Ambulance extends EmergencyVehicle implements VehicleMonitor {
    private String hospitalAffiliation;
    private boolean isOnEmergency;

    public Ambulance(String model, int speed, int maxSpeed, String hospitalAffiliation) {
        super(model, speed, maxSpeed, "Ambulance");
        this.hospitalAffiliation = hospitalAffiliation;
        this.isOnEmergency = false;
    }

    public void startEmergencyResponse() {
        this.isOnEmergency = true;
        System.out.println("Ambulance from " + hospitalAffiliation + " responding to emergency!");
    }

    public void endEmergencyResponse() {
        this.isOnEmergency = false;
        System.out.println("Emergency response completed.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking Ambulance status...");
        System.out.println("Hospital: " + hospitalAffiliation);
        System.out.println("Emergency Status: " + (isOnEmergency ? "On Emergency" : "Available"));
    }

    @Override
    public String getHealthStatus() {
        return "Ambulance " + getModel() + " - All systems operational";
    }

    @Override
    public void logVehicleData() {
        System.out.println("Logging ambulance data...");
        System.out.println("Vehicle ID: " + getModel());
        System.out.println("Hospital: " + hospitalAffiliation);
        System.out.println("Current Speed: " + getSpeed() + " km/h");
    }
}

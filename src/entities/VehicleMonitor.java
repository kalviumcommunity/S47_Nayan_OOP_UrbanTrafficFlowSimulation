package entities;

public interface VehicleMonitor {
    void checkStatus();
    String getHealthStatus();
    void logVehicleData();
}

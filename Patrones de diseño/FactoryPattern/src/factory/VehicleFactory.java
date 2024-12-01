package factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}

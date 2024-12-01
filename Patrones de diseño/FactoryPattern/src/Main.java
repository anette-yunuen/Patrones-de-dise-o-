import factory.Vehicle;
import factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive();
    }
}

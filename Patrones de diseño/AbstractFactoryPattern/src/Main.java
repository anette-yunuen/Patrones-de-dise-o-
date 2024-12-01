import factory.DeviceFactory;
import factory.Phone;
import factory.Laptop;
import factory.SamsungFactory;
import factory.AppleFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        samsungPhone.getDetails();
        samsungLaptop.getDetails();

        DeviceFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Laptop appleLaptop = appleFactory.createLaptop();

        applePhone.getDetails();
        appleLaptop.getDetails();
    }
}
